package _xml;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class Weather {

	private String result="";
	
   private static String getTagValue(String  tag, Element eElement) {
      NodeList nlList = eElement.getElementsByTagName(tag).item(0).getChildNodes();
      
      Node nValue = (Node) nlList.item(0);  //Node 으로 형 변환 하고 nlList이 읽어들인  item 태그의 첫번째 부터 읽어온다
      if(nValue ==null) 
        
      return null;                  // 값이 없으면 null을 출력
      return nValue.getNodeValue();   //XML의 요소를 읽기 위해 getNodeValue()를 사용했는데
   }
   
   public String getResult()
   {
		   return result;
   }
   
   public Weather(String year, String month, String date, String nx, String ny) {
      int page = 1;
      try {
         while(true) {
            
            // 파싱할 url + api 키 +&년도 &월
           String url = "http://newsky2.kma.go.kr/service/SecndSrtpdFrcstInfoService2/ForecastSpaceData?serviceKey=dGlWj8VeBPg791myPxkwvsUflmlqzggDP7yXefazRm7FGvRB9rxcdYMoFYQzjlPa7A02gOJ7qGeJfH6ZXGOQiA%3D%3D&base_date="+year+month+date+"&base_time=0500&nx="+nx+"&ny="+ny+"&numOfRows=10&pageSize=10&pageNo=1&startPage=1&_type=xml";
         
            /* 
            페이지에 접근해줄 Document객체 생성
            
            생성한 document 객체를 통해 파싱할 url의 요소를 읽어 들인다.
             doc.getDocumentElement().getNodeName()을 출력하면 XML의 최상위 tag 값을 가져온다 
             이 천문정보 tag 에서는 response 가 최상위 tag다.
            */
            DocumentBuilderFactory dbFactoty = DocumentBuilderFactory.newInstance();         
            DocumentBuilder dBuilder = dbFactoty.newDocumentBuilder();  //빌더 생성 
            Document doc = dBuilder.parse(url); //생성된 빌더를 통해서 xml문서를 Document객체로 파싱해서 가져온다


            
            // root tag 
            doc.getDocumentElement().normalize();  //문서 구조 안정화
            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());  //최상위 태그 
            
            
            /* 
             파싱할 tag 
             
             천문정보에서는 파싱할 데이터는 <item> 라는 tag안에 있으므로 이곳으로 접근한다.
             nList에 <item> 태그가 하나씩 담기게 되고 getLength()를 통해 리스트의 수를
             확인할 수 있다.              
             */
            NodeList nList = doc.getElementsByTagName("item");
            //System.out.println("파싱할 리스트 수 : "+ nList.getLength());
            
            /*
             list에 담긴 데이터 출력하기
             위에 담긴 list를 반복문을 이용하여 출력한다.
             getTextContent(): 전체 정보
             getTagValue("tag",element) : 입력한 tag 정보(따로 메소드를 정의해줘야한다)
             */
            for(int temp = 0; temp < nList.getLength(); temp++){
               Node nNode = nList.item(temp);
               if(nNode.getNodeType() == Node.ELEMENT_NODE){
            	  Element eElement = (Element) nNode;
            	  
            	  
            	  if(getTagValue("category", eElement).equals("POP"))
           	   {
            		  result = result + "강수확률 = " +getTagValue("fcstValue", eElement)+"% \n";
               }
               else if(getTagValue("category", eElement).equals("REH"))
           	   {
            		  result = result + "습도 = " +getTagValue("fcstValue", eElement)+"% \n";
               }
            else if(getTagValue("category", eElement).equals("TMX"))
        	   {
         		  result = result + "아침 최저 기온 = " +getTagValue("fcstValue", eElement)+"도 \n";
            }
                  System.out.println("######################");
                  //System.out.println(eElement.getTextContent());
                  System.out.println(" 날짜 : " + getTagValue("baseDate", eElement));
                  System.out.println(" 시간   : " + getTagValue("baseTime", eElement));
                  System.out.println(" 동네예보 항목값  : " + getTagValue("category", eElement));
                  System.out.println(" 예측 날짜  : " + getTagValue("fcstDate", eElement));
                  System.out.println(" 예측 시간  : " + getTagValue("fcstTime", eElement));
                  System.out.println(" 예측 값  : " + getTagValue("fcstValue", eElement));
                  System.out.println(" x 좌표  : " + getTagValue("nx", eElement));
                  System.out.println(" y 좌표  : " + getTagValue("ny", eElement));
               }   // for end
            }
         page += 1;
         System.out.println("page number : " +page);
         if(page>1) {
            break;         
      } //while end
         
         }
      }catch (Exception e) {
      e.printStackTrace();
      
      } // try~catch end
   }  // main end
}     // class end