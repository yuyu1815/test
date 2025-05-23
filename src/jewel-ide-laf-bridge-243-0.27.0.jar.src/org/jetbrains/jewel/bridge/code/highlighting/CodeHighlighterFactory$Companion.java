/*    */ package org.jetbrains.jewel.bridge.code.highlighting;
/*    */ 
/*    */ import com.intellij.openapi.components.ComponentManager;
/*    */ import com.intellij.openapi.components.ServicesKt;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
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
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\016\020\004\032\0020\0052\006\020\006\032\0020\007¨\006\b"}, d2 = {"Lorg/jetbrains/jewel/bridge/code/highlighting/CodeHighlighterFactory$Companion;", "", "<init>", "()V", "getInstance", "Lorg/jetbrains/jewel/bridge/code/highlighting/CodeHighlighterFactory;", "project", "Lcom/intellij/openapi/project/Project;", "ide-laf-bridge"})
/*    */ @SourceDebugExtension({"SMAP\nCodeHighlighterFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CodeHighlighterFactory.kt\norg/jetbrains/jewel/bridge/code/highlighting/CodeHighlighterFactory$Companion\n+ 2 services.kt\ncom/intellij/openapi/components/ServicesKt\n*L\n1#1,32:1\n31#2,2:33\n*S KotlinDebug\n*F\n+ 1 CodeHighlighterFactory.kt\norg/jetbrains/jewel/bridge/code/highlighting/CodeHighlighterFactory$Companion\n*L\n29#1:33,2\n*E\n"})
/*    */ public final class Companion
/*    */ {
/*    */   private Companion() {}
/*    */   
/*    */   @NotNull
/*    */   public final CodeHighlighterFactory getInstance(@NotNull Project project) {
/* 29 */     Intrinsics.checkNotNullParameter(project, "project"); ComponentManager $this$service$iv = (ComponentManager)project; int $i$f$service = 0;
/*    */ 
/*    */ 
/*    */     
/* 33 */     Class<CodeHighlighterFactory> serviceClass$iv = CodeHighlighterFactory.class;
/* 34 */     if ($this$service$iv.getService(serviceClass$iv) == null) { $this$service$iv.getService(serviceClass$iv); throw ServicesKt.serviceNotFoundError($this$service$iv, serviceClass$iv); }  return (CodeHighlighterFactory)$this$service$iv.getService(serviceClass$iv);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ide-laf-bridge-243-0.27.0.jar!\org\jetbrains\jewel\bridge\code\highlighting\CodeHighlighterFactory$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */