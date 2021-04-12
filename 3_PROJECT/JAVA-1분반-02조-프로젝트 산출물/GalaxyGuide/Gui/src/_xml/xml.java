package _xml;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class xml {

	private char IsTrue = 'F'; //
	
	private String T_result = "", F_result ;
   private static String getTagValue(String  tag, Element eElement) {
      NodeList nlList = eElement.getElementsByTagName(tag).item(0).getChildNodes();
      
      Node nValue = (Node) nlList.item(0);  //Node 으로 형 변환 하고 nlList이 읽어들인  item 태그의 첫번째 부터 읽어온다
      if(nValue ==null) 
        
      return null;                  // 값이 없으면 null을 출력
      return nValue.getNodeValue();   //XML의 요소를 읽기 위해 getNodeValue()를 사용했는데
   }

   
   public String getResult()
   {
	   if(IsTrue == 'T')
	   return T_result;
	   else
		   return F_result;
   }
   
   public xml(String year, String month, String date) {
      int page = 1;
      try {
         while(true) {
            
            // 파싱할 url + api 키 +&년도 &월
          String url = "http://apis.data.go.kr/B090041/openapi/service/AstroEventInfoService/getAstroEventInfo?serviceKey=dGlWj8VeBPg791myPxkwvsUflmlqzggDP7yXefazRm7FGvRB9rxcdYMoFYQzjlPa7A02gOJ7qGeJfH6ZXGOQiA%3D%3D&solYear="+year+"&solMonth="+month;
         
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
                  
                  //xml 매개변수로 받은 날짜와 같은 날짜의 이벤트를 얻기
            	   String gotdate = year + month + date;
            	   String eventdate = getTagValue("locdate", eElement);
            	   
            	   if(!gotdate.equals(eventdate))
            	   {
            		   F_result = "천문 이벤트가 없습니다.";
                	   System.out.println("불일치");

            	   }
            	   else 
            	   {
            		   T_result = T_result + "천문 이벤트 : " +getTagValue("astroEvent", eElement) + "시각 : " + getTagValue("astroTime", eElement) + "\n";
                	   System.out.println("일치");
                	   IsTrue = 'T';
            	   }
            	   
            	   System.out.println(gotdate);
            	   System.out.println(eventdate);

            	 //  System.out.println("######################");
                  System.out.println(eElement.getTextContent());
                  
               //   event = getTagValue("astroEvent", eElement);
               //   time = getTagValue("astroTime", eElement);
               //  System.out.println(" 천체 이벤트 : " + getTagValue("astroEvent", eElement));
                //  System.out.println(" 날짜   : " + getTagValue("locdate", eElement));
                // System.out.println("시간  : " + getTagValue("astroTime", eElement));
                  
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