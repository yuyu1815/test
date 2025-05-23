/*     */ package com.intellij.ml.llm.matterhorn.ej.core;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.actions.ActionRequest;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.actions.SimpleActionRequest;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.actions.SimpleActionRequest$;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.actions.ToolActionRequest;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.actions.ToolActionRequest$;
/*     */ import com.intellij.ml.llm.matterhorn.llm.MatterhornAssistantChatMessageWithToolUses;
/*     */ import com.intellij.ml.llm.matterhorn.llm.MatterhornAssistantChatMessageWithToolUses$;
/*     */ import com.intellij.ml.llm.matterhorn.llm.MatterhornChatElement;
/*     */ import com.intellij.ml.llm.matterhorn.llm.MatterhornChatMessage;
/*     */ import com.intellij.ml.llm.matterhorn.llm.MatterhornChatMessage$;
/*     */ import com.intellij.ml.llm.matterhorn.llm.MatterhornMultiPartChatMessage;
/*     */ import com.intellij.ml.llm.matterhorn.llm.MatterhornMultiPartChatMessage$;
/*     */ import com.intellij.ml.llm.matterhorn.llm.MatterhornUserChatMessageWithToolResults;
/*     */ import com.intellij.ml.llm.matterhorn.llm.MatterhornUserChatMessageWithToolResults$;
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.DeprecationLevel;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.JvmField;
/*     */ import kotlin.jvm.JvmStatic;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Reflection;
/*     */ import kotlin.reflect.KClass;
/*     */ import kotlinx.serialization.DeserializationStrategy;
/*     */ import kotlinx.serialization.KSerializer;
/*     */ import kotlinx.serialization.SealedClassSerializer;
/*     */ import kotlinx.serialization.Serializable;
/*     */ import kotlinx.serialization.SerializationStrategy;
/*     */ import kotlinx.serialization.UnknownFieldException;
/*     */ import kotlinx.serialization.builtins.BuiltinSerializersKt;
/*     */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*     */ import kotlinx.serialization.encoding.CompositeDecoder;
/*     */ import kotlinx.serialization.encoding.CompositeEncoder;
/*     */ import kotlinx.serialization.encoding.Decoder;
/*     */ import kotlinx.serialization.encoding.Encoder;
/*     */ import kotlinx.serialization.internal.GeneratedSerializer;
/*     */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*     */ import kotlinx.serialization.internal.SerializationConstructorMarker;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
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
/*     */ @Serializable
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000L\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\020\b\n\000\n\002\030\002\n\002\b\007\n\002\020\016\n\002\b\005\n\002\020\013\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 &2\0020\001:\002%&B!\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\b\020\006\032\004\030\0010\003¢\006\004\b\007\020\bB9\b\020\022\006\020\t\032\0020\n\022\b\020\002\032\004\030\0010\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\003\022\b\020\013\032\004\030\0010\f¢\006\004\b\007\020\rJ\b\020\023\032\0020\024H\026J\t\020\025\032\0020\003HÆ\003J\t\020\026\032\0020\005HÆ\003J\013\020\027\032\004\030\0010\003HÆ\003J)\020\030\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\n\b\002\020\006\032\004\030\0010\003HÆ\001J\023\020\031\032\0020\0322\b\020\033\032\004\030\0010\001HÖ\003J\t\020\034\032\0020\nHÖ\001J%\020\035\032\0020\0362\006\020\037\032\0020\0002\006\020 \032\0020!2\006\020\"\032\0020#H\001¢\006\002\b$R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\016\020\017R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\020\020\021R\023\020\006\032\004\030\0010\003¢\006\b\n\000\032\004\b\022\020\017¨\006'"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/AgentResponse;", "", "llmResponse", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;", "actionRequest", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;", "actionResult", "<init>", "(Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getLlmResponse", "()Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;", "getActionRequest", "()Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;", "getActionResult", "toString", "", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$ej_core", "$serializer", "Companion", "ej-core"})
/*     */ public final class AgentResponse
/*     */ {
/*     */   @NotNull
/*     */   private final MatterhornChatElement llmResponse;
/*     */   @NotNull
/*     */   private final ActionRequest actionRequest;
/*     */   @NotNull
/* 160 */   public static final Companion Companion = new Companion(null); @Nullable private final MatterhornChatElement actionResult; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; static { KSerializer[] arrayOfKSerializer1 = new KSerializer[3]; KClass[] arrayOfKClass3 = new KClass[4]; arrayOfKClass3[0] = Reflection.getOrCreateKotlinClass(MatterhornAssistantChatMessageWithToolUses.class); arrayOfKClass3[1] = Reflection.getOrCreateKotlinClass(MatterhornChatMessage.class); arrayOfKClass3[2] = Reflection.getOrCreateKotlinClass(MatterhornMultiPartChatMessage.class); arrayOfKClass3[3] = Reflection.getOrCreateKotlinClass(MatterhornUserChatMessageWithToolResults.class); KSerializer[] arrayOfKSerializer4 = new KSerializer[4]; arrayOfKSerializer4[0] = (KSerializer)MatterhornAssistantChatMessageWithToolUses$.serializer.INSTANCE; arrayOfKSerializer4[1] = (KSerializer)MatterhornChatMessage$.serializer.INSTANCE; arrayOfKSerializer4[2] = (KSerializer)MatterhornMultiPartChatMessage$.serializer.INSTANCE; arrayOfKSerializer4[3] = (KSerializer)MatterhornUserChatMessageWithToolResults$.serializer.INSTANCE; arrayOfKSerializer1[0] = (KSerializer)new SealedClassSerializer("com.intellij.ml.llm.matterhorn.llm.MatterhornChatElement", Reflection.getOrCreateKotlinClass(MatterhornChatElement.class), arrayOfKClass3, arrayOfKSerializer4, new java.lang.annotation.Annotation[0]); KClass[] arrayOfKClass2 = new KClass[2]; arrayOfKClass2[0] = Reflection.getOrCreateKotlinClass(SimpleActionRequest.class); arrayOfKClass2[1] = Reflection.getOrCreateKotlinClass(ToolActionRequest.class); KSerializer[] arrayOfKSerializer3 = new KSerializer[2]; arrayOfKSerializer3[0] = (KSerializer)SimpleActionRequest$.serializer.INSTANCE; arrayOfKSerializer3[1] = (KSerializer)ToolActionRequest$.serializer.INSTANCE; arrayOfKSerializer1[1] = (KSerializer)new SealedClassSerializer("com.intellij.ml.llm.matterhorn.ej.core.actions.ActionRequest", Reflection.getOrCreateKotlinClass(ActionRequest.class), arrayOfKClass2, arrayOfKSerializer3, new java.lang.annotation.Annotation[0]); KClass[] arrayOfKClass1 = new KClass[4]; arrayOfKClass1[0] = Reflection.getOrCreateKotlinClass(MatterhornAssistantChatMessageWithToolUses.class); arrayOfKClass1[1] = Reflection.getOrCreateKotlinClass(MatterhornChatMessage.class); arrayOfKClass1[2] = Reflection.getOrCreateKotlinClass(MatterhornMultiPartChatMessage.class); arrayOfKClass1[3] = Reflection.getOrCreateKotlinClass(MatterhornUserChatMessageWithToolResults.class); KSerializer[] arrayOfKSerializer2 = new KSerializer[4]; arrayOfKSerializer2[0] = (KSerializer)MatterhornAssistantChatMessageWithToolUses$.serializer.INSTANCE; arrayOfKSerializer2[1] = (KSerializer)MatterhornChatMessage$.serializer.INSTANCE; arrayOfKSerializer2[2] = (KSerializer)MatterhornMultiPartChatMessage$.serializer.INSTANCE; arrayOfKSerializer2[3] = (KSerializer)MatterhornUserChatMessageWithToolResults$.serializer.INSTANCE; arrayOfKSerializer1[2] = (KSerializer)new SealedClassSerializer("com.intellij.ml.llm.matterhorn.llm.MatterhornChatElement", Reflection.getOrCreateKotlinClass(MatterhornChatElement.class), arrayOfKClass1, arrayOfKSerializer2, new java.lang.annotation.Annotation[0]); $childSerializers = (KSerializer<Object>[])arrayOfKSerializer1; } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/AgentResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentResponse;", "ej-core"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<AgentResponse> serializer() { return (KSerializer<AgentResponse>)AgentResponse.$serializer.INSTANCE; }
/*     */      }
/* 162 */   public AgentResponse(@NotNull MatterhornChatElement llmResponse, @NotNull ActionRequest actionRequest, @Nullable MatterhornChatElement actionResult) { this.llmResponse = llmResponse;
/* 163 */     this.actionRequest = actionRequest;
/* 164 */     this.actionResult = actionResult; } @Nullable public final MatterhornChatElement getActionResult() { return this.actionResult; }
/*     */    @NotNull
/*     */   public final MatterhornChatElement getLlmResponse() {
/*     */     return this.llmResponse;
/*     */   } @NotNull
/*     */   public final ActionRequest getActionRequest() {
/*     */     return this.actionRequest;
/*     */   } @NotNull
/*     */   public String toString() {
/* 173 */     if (this.actionResult == null); return "\n## " + this.llmResponse.getContent() + "\n\n" + this.actionResult + "\n\n----------------------------\n\n```\n" + "" + "\n```\n";
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final MatterhornChatElement component1() {
/*     */     return this.llmResponse;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final ActionRequest component2() {
/*     */     return this.actionRequest;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final MatterhornChatElement component3() {
/*     */     return this.actionResult;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final AgentResponse copy(@NotNull MatterhornChatElement llmResponse, @NotNull ActionRequest actionRequest, @Nullable MatterhornChatElement actionResult) {
/*     */     Intrinsics.checkNotNullParameter(llmResponse, "llmResponse");
/*     */     Intrinsics.checkNotNullParameter(actionRequest, "actionRequest");
/*     */     return new AgentResponse(llmResponse, actionRequest, actionResult);
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = this.llmResponse.hashCode();
/*     */     result = result * 31 + this.actionRequest.hashCode();
/*     */     return result * 31 + ((this.actionResult == null) ? 0 : this.actionResult.hashCode());
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof AgentResponse))
/*     */       return false; 
/*     */     AgentResponse agentResponse = (AgentResponse)other;
/*     */     return !Intrinsics.areEqual(this.llmResponse, agentResponse.llmResponse) ? false : (!Intrinsics.areEqual(this.actionRequest, agentResponse.actionRequest) ? false : (!!Intrinsics.areEqual(this.actionResult, agentResponse.actionResult)));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\AgentResponse.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */