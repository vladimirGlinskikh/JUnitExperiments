package kz.zhelezyaka.junit.controller;

public interface RequestHandler {
    Response process(Request request) throws Exception;
}
