package VS2idl;


/**
* VS2idl/MessageData.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from VS2_klein.idl
* Samstag, 28. Januar 2017 02:24 Uhr MEZ
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
