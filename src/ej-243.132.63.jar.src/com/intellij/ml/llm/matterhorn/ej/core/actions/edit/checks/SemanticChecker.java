/*     */ package com.intellij.ml.llm.matterhorn.ej.core.actions.edit.checks;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\030\002\n\002\b\002\bf\030\000 \0022\0020\001:\001\002¨\006\003"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/SemanticChecker;", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/ErrorChecker;", "Companion", "ej-core"})
/*     */ public interface SemanticChecker
/*     */   extends ErrorChecker
/*     */ {
/*     */   @NotNull
/*     */   public static final Companion Companion = Companion.$$INSTANCE;
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   public static final class DefaultImpls
/*     */   {
/*     */     @NotNull
/*     */     public static String getNameForLogging(@NotNull SemanticChecker $this) {
/*  37 */       return ErrorChecker.DefaultImpls.getNameForLogging($this); } } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020 \n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/SemanticChecker$Companion;", "", "<init>", "()V", "getSemanticCheckers", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/SemanticChecker;", "ej-core"}) @SourceDebugExtension({"SMAP\nErrorChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ErrorChecker.kt\ncom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/SemanticChecker$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,100:1\n808#2,11:101\n*S KotlinDebug\n*F\n+ 1 ErrorChecker.kt\ncom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/SemanticChecker$Companion\n*L\n39#1:101,11\n*E\n"})
/*     */   public static final class Companion { @NotNull
/*  39 */     public final List<SemanticChecker> getSemanticCheckers() { Iterable<ErrorChecker> $this$filterIsInstance$iv = ErrorChecker.Companion.getErrorCheckers(); int $i$f$filterIsInstance = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 101 */       Iterable<ErrorChecker> iterable1 = $this$filterIsInstance$iv; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterIsInstanceTo = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 110 */       for (ErrorChecker element$iv$iv : iterable1) { if (element$iv$iv instanceof SemanticChecker) destination$iv$iv.add(element$iv$iv);  }
/* 111 */        return (List)destination$iv$iv; }
/*     */      }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\edit\checks\SemanticChecker.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */