package file_system.fs_blockServer;

import file_system.*;
import sun.security.rsa.RSAPublicKeyImpl;

import java.io.IOException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;


public interface RmiServerIntf extends Remote {
    Object serverRequest(byte[] digest, String functionName, ArrayList<Object> args) throws IOException, InterruptedException, NoSuchAlgorithmException, DifferentTimestampException, IntegrityViolationException, InvalidKeyException;
}
