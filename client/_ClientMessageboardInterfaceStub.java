
/**
* _ClientMessageboardInterfaceStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from VS2_klein.idl
* Sunday, January 29, 2017 6:31:59 PM CET
*/

public class _ClientMessageboardInterfaceStub extends org.omg.CORBA.portable.ObjectImpl implements ClientMessageboardInterface
{

  public MessageData[] getMessages ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("getMessages", true);
                $in = _invoke ($out);
                MessageData $result[] = array_of_MessageDataHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return getMessages (        );
            } finally {
                _releaseReply ($in);
            }
  } // getMessages

  public boolean setMessage (String message, int uid, String uName)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("setMessage", true);
                $out.write_string (message);
                $out.write_long (uid);
                $out.write_string (uName);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return setMessage (message, uid, uName        );
            } finally {
                _releaseReply ($in);
            }
  } // setMessage

  public boolean deleteMessage (int uid)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("deleteMessage", true);
                $out.write_long (uid);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return deleteMessage (uid        );
            } finally {
                _releaseReply ($in);
            }
  } // deleteMessage

  public boolean createNewMessage (String message, int uid, String uName)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("createNewMessage", true);
                $out.write_string (message);
                $out.write_long (uid);
                $out.write_string (uName);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return createNewMessage (message, uid, uName        );
            } finally {
                _releaseReply ($in);
            }
  } // createNewMessage

  public MessageData getNextMessage ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("getNextMessage", true);
                $in = _invoke ($out);
                MessageData $result = MessageDataHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return getNextMessage (        );
            } finally {
                _releaseReply ($in);
            }
  } // getNextMessage

  public MessageData getPreviousMessage ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("getPreviousMessage", true);
                $in = _invoke ($out);
                MessageData $result = MessageDataHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return getPreviousMessage (        );
            } finally {
                _releaseReply ($in);
            }
  } // getPreviousMessage

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:ClientMessageboardInterface:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     org.omg.CORBA.Object obj = orb.string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
   } finally {
     orb.destroy() ;
   }
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     String str = orb.object_to_string (this);
     s.writeUTF (str);
   } finally {
     orb.destroy() ;
   }
  }
} // class _ClientMessageboardInterfaceStub
