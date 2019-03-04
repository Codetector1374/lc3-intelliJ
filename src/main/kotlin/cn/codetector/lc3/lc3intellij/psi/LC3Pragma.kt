package cn.codetector.lc3.lc3intellij.psi

import com.intellij.psi.PsiComment

object LC3Pragma {

    val pragmaRegex = Regex("^; *pragma +([a-zA-Z].*)")

    fun isPragma(p: PsiComment) = pragmaRegex.matches(p.text)

    fun getPragma(p: PsiComment) = pragmaRegex.matchEntire(p.text)!!.groupValues[1]




}