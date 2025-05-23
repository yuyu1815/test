/*    */ package com.intellij.ml.llm.matterhorn.helpers;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.FailedDependencyException;
/*    */ import java.io.PrintWriter;
/*    */ import java.io.StringWriter;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000\020\n\000\n\002\020\016\n\002\030\002\n\002\030\002\n\000\032\016\020\000\032\0020\001*\0060\002j\002`\003¨\006\004"}, d2 = {"exceptionToString", "", "Ljava/lang/Exception;", "Lkotlin/Exception;", "core"})
/*    */ public final class TeamCityLoggerKt
/*    */ {
/*    */   @NotNull
/*    */   public static final String exceptionToString(@NotNull Exception $this$exceptionToString) {
/* 54 */     Intrinsics.checkNotNullParameter($this$exceptionToString, "<this>"); StringWriter writer = new StringWriter();
/* 55 */     PrintWriter printer = new PrintWriter(writer);
/* 56 */     $this$exceptionToString.printStackTrace(printer);
/*    */     
/* 58 */     if ($this$exceptionToString instanceof FailedDependencyException) {
/* 59 */       printer.println("Artifact reason:");
/* 60 */       printer.println(((FailedDependencyException)$this$exceptionToString).getArtifact().getReasoning().getReason().getMessage());
/*    */     } 
/* 62 */     Intrinsics.checkNotNullExpressionValue(writer.toString(), "toString(...)"); String details = writer.toString();
/* 63 */     return details;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\helpers\TeamCityLoggerKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */