
/**
* ClientMessageboardInterfaceHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from VS2_klein.idl
* Thursday, January 26, 2017 11:58:00 AM CET
*/

public final class ClientMessageboardInterfaceHolder implements org.omg.CORBA.portable.Streamable
{
  public ClientMessageboardInterface value = null;

  public ClientMessageboardInterfaceHolder ()
  {
  }

  public ClientMessageboardInterfaceHolder (ClientMessageboardInterface initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ClientMessageboardInterfaceHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ClientMessageboardInterfaceHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ClientMessageboardInterfaceHelper.type ();
  }

}
