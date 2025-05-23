/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.login.states;
/*    */ 
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import kotlin.Metadata;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\005\b\007\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/JbaUnauthenticated$LoginPhase$Error;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/JbaUnauthenticated$LoginPhase;", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "ej-ui"})
/*    */ @StabilityInferred(parameters = 1)
/*    */ public final class Error
/*    */   extends JbaUnauthenticated.LoginPhase
/*    */ {
/*    */   @NotNull
/*    */   private final String message;
/*    */   public static final int $stable;
/*    */   
/*    */   public Error(@NotNull String message) {
/* 79 */     super(null); this.message = message; } @NotNull public final String getMessage() { return this.message; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\login\states\JbaUnauthenticated$LoginPhase$Error.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */