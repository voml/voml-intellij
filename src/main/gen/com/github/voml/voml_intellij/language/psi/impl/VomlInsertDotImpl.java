// This is a generated file. Not intended for manual editing.
package com.github.voml.voml_intellij.language.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.github.voml.voml_intellij.language.psi.VomlTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.github.voml.voml_intellij.language.psi.*;

public class VomlInsertDotImpl extends ASTWrapperPsiElement implements VomlInsertDot {

  public VomlInsertDotImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VomlVisitor visitor) {
    visitor.visitInsertDot(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VomlVisitor) accept((VomlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public PsiElement getDot() {
    return findNotNullChildByType(DOT);
  }

}
