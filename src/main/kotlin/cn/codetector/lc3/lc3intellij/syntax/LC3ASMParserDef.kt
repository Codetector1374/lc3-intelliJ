package cn.codetector.lc3.lc3intellij.syntax

import com.intellij.lexer.FlexAdapter
import cn.codetector.lc3.lc3intellij.lang.LC3ASMLexer
import java.io.Reader

class LC3LexerAdapter : FlexAdapter(LC3ASMLexer(null))