
/**
* MessageData.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from VS2_klein.idl
* Sunday, January 29, 2017 6:31:59 PM CET
*/

public final class MessageData implements org.omg.CORBA.portable.IDLEntity
{
  public int uid = (int)0;
  public String id = null;
  public String uName = null;
  public String text = null;

  public MessageData ()
  {
  } // ctor

  public MessageData (int _uid, String _id, String _uName, String _text)
  {
    uid = _uid;
    id = _id;
    uName = _uName;
    text = _text;
  } // ctor

} // class MessageData
