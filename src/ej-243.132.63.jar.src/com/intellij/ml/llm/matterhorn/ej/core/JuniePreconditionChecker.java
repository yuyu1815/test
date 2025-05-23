/*    */ package com.intellij.ml.llm.matterhorn.ej.core;
/*    */ 
/*    */ import com.intellij.openapi.project.Project;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\020\000\n\000\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\002\b\003\bf\030\0002\0020\001:\001\bJ\026\020\002\032\b\022\004\022\0020\0040\0032\006\020\005\032\0020\006H&J\026\020\007\032\b\022\004\022\0020\0040\0032\006\020\005\032\0020\006H&¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/JuniePreconditionChecker;", "", "checkJunieAvailable", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/JuniePreconditionChecker$JunieProblem;", "project", "Lcom/intellij/openapi/project/Project;", "canRunJunie", "JunieProblem", "ej-core"})
/*    */ public interface JuniePreconditionChecker
/*    */ {
/*    */   @NotNull
/*    */   List<JunieProblem> checkJunieAvailable(@NotNull Project paramProject);
/*    */   
/*    */   @NotNull
/*    */   List<JunieProblem> canRunJunie(@NotNull Project paramProject);
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\002\030\002\n\002\020\013\n\002\b\n\030\0002\0020\001B=\022\006\020\002\032\0020\003\022\n\b\002\020\004\032\004\030\0010\003\022 \b\002\020\005\032\032\b\001\022\n\022\b\022\004\022\0020\b0\007\022\006\022\004\030\0010\001\030\0010\006¢\006\004\b\t\020\nJ\b\020\021\032\0020\003H\026R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\013\020\fR\023\020\004\032\004\030\0010\003¢\006\b\n\000\032\004\b\r\020\fR+\020\005\032\032\b\001\022\n\022\b\022\004\022\0020\b0\007\022\006\022\004\030\0010\001\030\0010\006¢\006\n\n\002\020\020\032\004\b\016\020\017¨\006\022"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/JuniePreconditionChecker$JunieProblem;", "", "text", "", "actionName", "action", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "getText", "()Ljava/lang/String;", "getActionName", "getAction", "()Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function1;", "toString", "ej-core"})
/*    */   public static final class JunieProblem
/*    */   {
/*    */     @NotNull
/*    */     private final String text;
/*    */     @Nullable
/*    */     private final String actionName;
/*    */     @Nullable
/*    */     private final Function1<Continuation<? super Boolean>, Object> action;
/*    */     
/*    */     public JunieProblem(@NotNull String text, @Nullable String actionName, @Nullable Function1<Continuation<? super Boolean>, Object> action) {
/* 34 */       this.text = text; this.actionName = actionName; this.action = action; } @NotNull public final String getText() { return this.text; } @Nullable public final String getActionName() { return this.actionName; } @Nullable public final Function1<Continuation<? super Boolean>, Object> getAction() { return this.action; }
/*    */      @NotNull
/*    */     public String toString() {
/* 37 */       return "JunieProblem(text='" + this.text + "', actionName=" + this.actionName + ")";
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\JuniePreconditionChecker.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */