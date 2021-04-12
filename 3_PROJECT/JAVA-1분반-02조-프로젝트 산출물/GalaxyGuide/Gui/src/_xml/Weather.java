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
      
      Node nValue = (Node) nlList.item(0);  //Node ���� �� ��ȯ �ϰ� nlList�� �о����  item �±��� ù��° ���� �о�´�
      if(nValue ==null) 
        
      return null;                  // ���� ������ null�� ���
      return nValue.getNodeValue();   //XML�� ��Ҹ� �б� ���� getNodeValue()�� ����ߴµ�
   }
   
   public String getResult()
   {
		   return result;
   }
   
   public Weather(String year, String month, String date, String nx, String ny) {
      int page = 1;
      try {
         while(true) {
            
            // �Ľ��� url + api Ű +&�⵵ &��
           String url = "http://newsky2.kma.go.kr/service/SecndSrtpdFrcstInfoService2/ForecastSpaceData?serviceKey=dGlWj8VeBPg791myPxkwvsUflmlqzggDP7yXefazRm7FGvRB9rxcdYMoFYQzjlPa7A02gOJ7qGeJfH6ZXGOQiA%3D%3D&base_date="+year+month+date+"&base_time=0500&nx="+nx+"&ny="+ny+"&numOfRows=10&pageSize=10&pageNo=1&startPage=1&_type=xml";
         
            /* 
            �������� �������� Document��ü ����
            
            ������ document ��ü�� ���� �Ľ��� url�� ��Ҹ� �о� ���δ�.
             doc.getDocumentElement().getNodeName()�� ����ϸ� XML�� �ֻ��� tag ���� �����´� 
             �� õ������ tag ������ response �� �ֻ��� tag��.
            */
            DocumentBuilderFactory dbFactoty = DocumentBuilderFactory.newInstance();         
            DocumentBuilder dBuilder = dbFactoty.newDocumentBuilder();  //���� ���� 
            Document doc = dBuilder.parse(url); //������ ������ ���ؼ� xml������ Document��ü�� �Ľ��ؼ� �����´�


            
            // root tag 
            doc.getDocumentElement().normalize();  //���� ���� ����ȭ
            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());  //�ֻ��� �±� 
            
            
            /* 
             �Ľ��� tag 
             
             õ������������ �Ľ��� �����ʹ� <item> ��� tag�ȿ� �����Ƿ� �̰����� �����Ѵ�.
             nList�� <item> �±װ� �ϳ��� ���� �ǰ� getLength()�� ���� ����Ʈ�� ����
             Ȯ���� �� �ִ�.              
             */
            NodeList nList = doc.getElementsByTagName("item");
            //System.out.println("�Ľ��� ����Ʈ �� : "+ nList.getLength());
            
            /*
             list�� ��� ������ ����ϱ�
             ���� ��� list�� �ݺ����� �̿��Ͽ� ����Ѵ�.
             getTextContent(): ��ü ����
             getTagValue("tag",element) : �Է��� tag ����(���� �޼ҵ带 ����������Ѵ�)
             */
            for(int temp = 0; temp < nList.getLength(); temp++){
               Node nNode = nList.item(temp);
               if(nNode.getNodeType() == Node.ELEMENT_NODE){
            	  Element eElement = (Element) nNode;
            	  
            	  
            	  if(getTagValue("category", eElement).equals("POP"))
           	   {
            		  result = result + "����Ȯ�� = " +getTagValue("fcstValue", eElement)+"% \n";
               }
               else if(getTagValue("category", eElement).equals("REH"))
           	   {
            		  result = result + "���� = " +getTagValue("fcstValue", eElement)+"% \n";
               }
            else if(getTagValue("category", eElement).equals("TMX"))
        	   {
         		  result = result + "��ħ ���� ��� = " +getTagValue("fcstValue", eElement)+"�� \n";
            }
                  System.out.println("######################");
                  //System.out.println(eElement.getTextContent());
                  System.out.println(" ��¥ : " + getTagValue("baseDate", eElement));
                  System.out.println(" �ð�   : " + getTagValue("baseTime", eElement));
                  System.out.println(" ���׿��� �׸�  : " + getTagValue("category", eElement));
                  System.out.println(" ���� ��¥  : " + getTagValue("fcstDate", eElement));
                  System.out.println(" ���� �ð�  : " + getTagValue("fcstTime", eElement));
                  System.out.println(" ���� ��  : " + getTagValue("fcstValue", eElement));
                  System.out.println(" x ��ǥ  : " + getTagValue("nx", eElement));
                  System.out.println(" y ��ǥ  : " + getTagValue("ny", eElement));
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