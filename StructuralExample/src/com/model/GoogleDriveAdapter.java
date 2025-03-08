package com.model;

public class GoogleDriveAdapter implements GoogleDrive {
    private CloudStorage googleDrive;

    public GoogleDriveAdapter(String function) {
    	if(function.equalsIgnoreCase("upload"))
    	{
    		googleDrive = new uploadFile();
    	}
    	else if(function.equalsIgnoreCase("Download"))
    	{
    		googleDrive = new downloadFile();
    	}
    	else if(function.equalsIgnoreCase("Delete"))
    	{
    		googleDrive = new deleteFile();
    	}

    }

   
	@Override
	public void upload(String fileName,String Function) {
		if(Function.equalsIgnoreCase("Upload"))
		{
			googleDrive.uploadFile(fileName);
		}
		else if(Function.equalsIgnoreCase("download"))
		{
			googleDrive.downloadFile(fileName);
		}
		else if(Function.equalsIgnoreCase("delete"))
		{
			googleDrive.deleteFile(fileName);
		}
		// TODO Auto-generated method stub
		
	}
}