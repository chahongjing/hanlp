package org.example;

import com.hankcs.hanlp.HanLP;
import com.hankcs.hanlp.seg.common.Term;
import com.hankcs.hanlp.tokenizer.NLPTokenizer;
import com.hankcs.hanlp.tokenizer.StandardTokenizer;

import java.io.*;
import java.util.Collections;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
//        HanlpTest.segment();
//        // 词频统计
//        HanlpTest.extractKeyword();
//        // 抽取关键字
//        HanlpTest.hanLPSegment();
        // 智能提示
        HanlpTest.suggest_test();
        // 中国人姓名识别
//        HanlpTest.nameRecognize();
    }
}
