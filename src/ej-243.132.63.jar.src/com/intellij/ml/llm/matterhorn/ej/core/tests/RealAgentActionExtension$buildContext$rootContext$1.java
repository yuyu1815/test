/*    */ package com.intellij.ml.llm.matterhorn.ej.core.tests;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.llm.LLMProxy;
/*    */ import com.intellij.ml.llm.matterhorn.llm.MatterhornChat;
/*    */ import com.intellij.ml.llm.matterhorn.llm.ModelParameters;
/*    */ import com.intellij.ml.llm.matterhorn.settings.MatterhornPropertyProvider;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.functions.Function4;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000A\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\020\002\n\002\b\003\n\002\030\002\n\002\020\b\n\002\030\002\n\002\020\000\n\002\b\002*\001\000\b\n\030\0002\0020\001J2\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\0072\022\020\b\032\016\022\004\022\0020\n\022\004\022\0020\0130\tH@¢\006\002\020\fJ2\020\r\032\0020\0032\"\020\016\032\036\b\001\022\004\022\0020\020\022\n\022\b\022\004\022\0020\0030\021\022\006\022\004\030\0010\0220\017H@¢\006\002\020\023¨\006\024"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/core/tests/RealAgentActionExtension$buildContext$rootContext$1", "Lcom/intellij/ml/llm/matterhorn/llm/LLMProxy;", "sendChat", "Lcom/intellij/ml/llm/matterhorn/llm/AIAnswer;", "chat", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;", "modelParameters", "Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;", "eventHandler", "Lkotlin/Function1;", "Lcom/intellij/ml/llm/matterhorn/CustomArtifactEvent;", "", "(Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendWithRecovery", "send", "Lkotlin/Function2;", "", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ej-core-test"})
/*    */ public final class RealAgentActionExtension$buildContext$rootContext$1
/*    */   implements LLMProxy
/*    */ {
/*    */   public Object sendWithTracking(MatterhornChat chat, ModelParameters modelParameters, MatterhornPropertyProvider propertyProvider, Function4 request, Function1 eventHandler, Continuation $completion) {
/* 25 */     return LLMProxy.DefaultImpls.sendWithTracking(this, chat, modelParameters, propertyProvider, request, eventHandler, $completion); } public boolean getImagesSupported() { return LLMProxy.DefaultImpls.getImagesSupported(this); }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Object sendChat(MatterhornChat chat, ModelParameters modelParameters, Function1 eventHandler, Continuation $completion) {
/* 31 */     throw new IllegalStateException("LLM is not supported in tests".toString());
/*    */   }
/*    */   
/*    */   public Object sendWithRecovery(Function2 send, Continuation $completion) {
/* 35 */     throw new IllegalStateException("LLM is not supported in tests".toString());
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\tests\RealAgentActionExtension$buildContext$rootContext$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */