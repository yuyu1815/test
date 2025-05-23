/*    */ package com.intellij.ml.llm.matterhorn.core.llm.grazie;
/*    */ import ai.grazie.api.gateway.client.api.llm.ChatRequestBuilder;
/*    */ import ai.grazie.model.llm.chat.v5.LLMChat;
/*    */ import com.intellij.ml.llm.matterhorn.llm.MatterhornChatElement;
/*    */ import com.intellij.ml.llm.matterhorn.llm.MatterhornChatMessageKind;
/*    */ import com.intellij.ml.llm.matterhorn.llm.ModelParameters;
/*    */ import java.util.Iterator;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\002\n\000\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J,\020\004\032\0020\005*\0020\0052\f\020\006\032\b\022\004\022\0020\b0\0072\006\020\t\032\0020\n2\n\b\002\020\013\032\004\030\0010\fJ,\020\r\032\0020\016*\0020\0052\f\020\006\032\b\022\004\022\0020\b0\0072\006\020\t\032\0020\n2\b\020\013\032\004\030\0010\fH\002¨\006\017"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/grazie/GrazieChatMessageUtils;", "", "<init>", "()V", "addMessages", "Lai/grazie/model/llm/chat/v5/LLMChat$Builder;", "messages", "", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;", "modelParameters", "Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;", "requestBuilder", "Lai/grazie/api/gateway/client/api/llm/ChatRequestBuilder;", "writeMessages", "", "core-llm"})
/*    */ @SourceDebugExtension({"SMAP\nGrazieChatMessageUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GrazieChatMessageUtils.kt\ncom/intellij/ml/llm/matterhorn/core/llm/grazie/GrazieChatMessageUtils\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 Json.kt\nkotlinx/serialization/json/Json\n*L\n1#1,86:1\n1863#2:87\n1557#2:88\n1628#2,3:89\n1863#2:92\n1863#2:93\n1246#2,4:96\n1864#2:101\n1864#2:102\n1557#2:103\n1628#2,3:104\n1368#2:107\n1454#2,5:108\n1863#2,2:113\n1864#2:115\n462#3:94\n412#3:95\n205#4:100\n*S KotlinDebug\n*F\n+ 1 GrazieChatMessageUtils.kt\ncom/intellij/ml/llm/matterhorn/core/llm/grazie/GrazieChatMessageUtils\n*L\n30#1:87\n40#1:88\n40#1:89,3\n40#1:92\n41#1:93\n42#1:96,4\n41#1:101\n40#1:102\n57#1:103\n57#1:104,3\n57#1:107\n57#1:108,5\n58#1:113,2\n30#1:115\n42#1:94\n42#1:95\n48#1:100\n*E\n"})
/*    */ public final class GrazieChatMessageUtils {
/*    */   @NotNull
/*    */   public final LLMChat.Builder addMessages(@NotNull LLMChat.Builder $this$addMessages, @NotNull List<? extends MatterhornChatElement> messages, @NotNull ModelParameters modelParameters, @Nullable ChatRequestBuilder requestBuilder) {
/* 20 */     Intrinsics.checkNotNullParameter($this$addMessages, "<this>"); Intrinsics.checkNotNullParameter(messages, "messages"); Intrinsics.checkNotNullParameter(modelParameters, "modelParameters"); writeMessages($this$addMessages, messages, modelParameters, requestBuilder);
/* 21 */     return $this$addMessages;
/*    */   }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public static final GrazieChatMessageUtils INSTANCE = new GrazieChatMessageUtils();
/*    */   
/*    */   private final void writeMessages(LLMChat.Builder $this$writeMessages, List messages, ModelParameters modelParameters, ChatRequestBuilder requestBuilder) {
/* 29 */     int userMessageOffset = 0;
/* 30 */     Iterable $this$forEach$iv = messages; int $i$f$forEach = 0;
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
/* 87 */     Iterator iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); MatterhornChatElement message = (MatterhornChatElement)element$iv; int $i$a$-forEach-GrazieChatMessageUtils$writeMessages$1 = 0;
/*    */       MatterhornChatElement matterhornChatElement1 = message; }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\core\llm\grazie\GrazieChatMessageUtils.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */