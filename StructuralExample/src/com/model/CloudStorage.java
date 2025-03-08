package com.model;

interface CloudStorage {
    void uploadFile(String fileName);
    void downloadFile(String fileName);
    void deleteFile(String fileName);
}