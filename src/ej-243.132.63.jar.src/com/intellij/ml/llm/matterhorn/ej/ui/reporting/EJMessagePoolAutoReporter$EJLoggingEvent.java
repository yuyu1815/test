/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.reporting;
/*    */ 
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import com.intellij.openapi.diagnostic.IdeaLoggingEvent;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\004\b\007\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\b\020\006\032\0020\003H\026R\016\020\002\032\0020\003X\004¢\006\002\n\000¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/reporting/EJMessagePoolAutoReporter$EJLoggingEvent;", "Lcom/intellij/openapi/diagnostic/IdeaLoggingEvent;", "stacktrace", "", "<init>", "(Ljava/lang/String;)V", "getThrowableText", "ej-ui"})
/*    */ @StabilityInferred(parameters = 1)
/*    */ public final class EJLoggingEvent
/*    */   extends IdeaLoggingEvent
/*    */ {
/*    */   @NotNull
/*    */   private final String stacktrace;
/*    */   public static final int $stable;
/*    */   
/*    */   public EJLoggingEvent(@NotNull String stacktrace) {
/* 31 */     super("Automatically reported exception", null, null);
/*    */     this.stacktrace = stacktrace; } @NotNull
/* 33 */   public String getThrowableText() { return this.stacktrace; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\reporting\EJMessagePoolAutoReporter$EJLoggingEvent.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */