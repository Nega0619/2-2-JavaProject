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
      
      Node nValue = (Node) nlList.item(0);  //Node ���� �� ��ȯ �ϰ� nlList�� �о����  item �±��� ù��° ���� �о�´�
      if(nValue ==null) 
        
      return null;                  // ���� ������ null�� ���
      return nValue.getNodeValue();   //XML�� ��Ҹ� �б� ���� getNodeValue()�� ����ߴµ�
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
            
            // �Ľ��� url + api Ű +&�⵵ &��
          String url = "http://apis.data.go.kr/B090041/openapi/service/AstroEventInfoService/getAstroEventInfo?serviceKey=dGlWj8VeBPg791myPxkwvsUflmlqzggDP7yXefazRm7FGvRB9rxcdYMoFYQzjlPa7A02gOJ7qGeJfH6ZXGOQiA%3D%3D&solYear="+year+"&solMonth="+month;
         
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
                  
                  //xml �Ű������� ���� ��¥�� ���� ��¥�� �̺�Ʈ�� ���
            	   String gotdate = year + month + date;
            	   String eventdate = getTagValue("locdate", eElement);
            	   
            	   if(!gotdate.equals(eventdate))
            	   {
            		   F_result = "õ�� �̺�Ʈ�� �����ϴ�.";
                	   System.out.println("����ġ");

            	   }
            	   else 
            	   {
            		   T_result = T_result + "õ�� �̺�Ʈ : " +getTagValue("astroEvent", eElement) + "�ð� : " + getTagValue("astroTime", eElement) + "\n";
                	   System.out.println("��ġ");
                	   IsTrue = 'T';
            	   }
            	   
            	   System.out.println(gotdate);
            	   System.out.println(eventdate);

            	 //  System.out.println("######################");
                  System.out.println(eElement.getTextContent());
                  
               //   event = getTagValue("astroEvent", eElement);
               //   time = getTagValue("astroTime", eElement);
               //  System.out.println(" õü �̺�Ʈ : " + getTagValue("astroEvent", eElement));
                //  System.out.println(" ��¥   : " + getTagValue("locdate", eElement));
                // System.out.println("�ð�  : " + getTagValue("astroTime", eElement));
                  
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