/*
 * ServerClient.h
 *
 *  Created on: 31.01.2017
 *      Author: Marco Palumbo
 *      Server-Client zur kommunikation mit anderen Servern
 */

#ifndef SERVERCLIENT_H_
#define SERVERCLIENT_H_

#include <iostream>
#include <fstream>
#include "./VS2.hh"
#include "./ConnectInformation.h"

using namespace std;

class ServerClient
{
    private:
        // CORBA ORB
        CORBA::ORB_var orb;                                                                            
        CORBA::Object_var orbObj;      // ORB Object
        CORBA::Object_var resObj;     // Resolved id to object reference
        VS2::MessageboardServerInterface_var m_Data; // Resolved and narrowed CORBA object for proxy calls     
        int initParameterCount = 4; //
        char * initParameter[4];
        void createInitParameter();
        char * copyString(string zeichen);
        ConnectInformation * connectInformation = 0;                                                                     
    public:
        ServerClient(ConnectInformation * connectInformation);
        ~ServerClient();
        
};

class DS_ServerConnectionException
{
    public:
        DS_ServerConnectionException() { cerr << "CORBA COMM_FAILURE" << endl; };
};
                                                                                
class DS_SystemException
{
    public:
        DS_SystemException() { cerr << "CORBA Exception" << endl; };
};
                                                                                
class DS_FatalException
{
    public:
        DS_FatalException() { cerr << "CORBA Fatal Exception" << endl; };
};
                                                                                
class DS_Exception
{
    public:
        DS_Exception() { cerr << "Exception" << endl; };
};

#endif
