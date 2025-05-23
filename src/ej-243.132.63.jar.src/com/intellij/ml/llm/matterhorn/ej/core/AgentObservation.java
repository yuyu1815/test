/*    */ package com.intellij.ml.llm.matterhorn.ej.core;
/*    */ import com.intellij.ml.llm.matterhorn.llm.MatterhornChatElement;
/*    */ import kotlin.DeprecationLevel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Reflection;
/*    */ import kotlin.reflect.KClass;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.Serializable;
/*    */ import kotlinx.serialization.SerializationStrategy;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import kotlinx.serialization.internal.StringSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\003\n\002\020\b\n\000\n\002\030\002\n\002\b\n\n\002\020\013\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 \"2\0020\001:\002!\"B\033\022\006\020\002\032\0020\003\022\n\b\002\020\004\032\004\030\0010\005¢\006\004\b\006\020\007B/\b\020\022\006\020\b\032\0020\t\022\b\020\002\032\004\030\0010\003\022\b\020\004\032\004\030\0010\005\022\b\020\n\032\004\030\0010\013¢\006\004\b\006\020\fJ\b\020\021\032\0020\005H\026J\t\020\022\032\0020\003HÆ\003J\013\020\023\032\004\030\0010\005HÆ\003J\037\020\024\032\0020\0002\b\b\002\020\002\032\0020\0032\n\b\002\020\004\032\004\030\0010\005HÆ\001J\023\020\025\032\0020\0262\b\020\027\032\004\030\0010\001HÖ\003J\t\020\030\032\0020\tHÖ\001J%\020\031\032\0020\0322\006\020\033\032\0020\0002\006\020\034\032\0020\0352\006\020\036\032\0020\037H\001¢\006\002\b R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\r\020\016R\023\020\004\032\004\030\0010\005¢\006\b\n\000\032\004\b\017\020\020¨\006#"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/AgentObservation;", "", "element", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;", "action", "", "<init>", "(Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getElement", "()Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;", "getAction", "()Ljava/lang/String;", "toString", "component1", "component2", "copy", "equals", "", "other", "hashCode", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$ej_core", "$serializer", "Companion", "ej-core"})
/*    */ public final class AgentObservation {
/*    */   @NotNull
/* 27 */   public static final Companion Companion = new Companion(null); @NotNull private final MatterhornChatElement element; @Nullable private final String action; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; static { KSerializer[] arrayOfKSerializer1 = new KSerializer[2]; KClass[] arrayOfKClass = new KClass[4]; arrayOfKClass[0] = Reflection.getOrCreateKotlinClass(MatterhornAssistantChatMessageWithToolUses.class); arrayOfKClass[1] = Reflection.getOrCreateKotlinClass(MatterhornChatMessage.class); arrayOfKClass[2] = Reflection.getOrCreateKotlinClass(MatterhornMultiPartChatMessage.class); arrayOfKClass[3] = Reflection.getOrCreateKotlinClass(MatterhornUserChatMessageWithToolResults.class); KSerializer[] arrayOfKSerializer2 = new KSerializer[4]; arrayOfKSerializer2[0] = (KSerializer)MatterhornAssistantChatMessageWithToolUses$.serializer.INSTANCE; arrayOfKSerializer2[1] = (KSerializer)MatterhornChatMessage$.serializer.INSTANCE; arrayOfKSerializer2[2] = (KSerializer)MatterhornMultiPartChatMessage$.serializer.INSTANCE; arrayOfKSerializer2[3] = (KSerializer)MatterhornUserChatMessageWithToolResults$.serializer.INSTANCE; arrayOfKSerializer1[0] = (KSerializer)new SealedClassSerializer("com.intellij.ml.llm.matterhorn.llm.MatterhornChatElement", Reflection.getOrCreateKotlinClass(MatterhornChatElement.class), arrayOfKClass, arrayOfKSerializer2, new java.lang.annotation.Annotation[0]); arrayOfKSerializer1[1] = null; $childSerializers = (KSerializer<Object>[])arrayOfKSerializer1; } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/AgentObservation$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentObservation;", "ej-core"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<AgentObservation> serializer() { return (KSerializer<AgentObservation>)AgentObservation.$serializer.INSTANCE; } }
/* 28 */    public AgentObservation(@NotNull MatterhornChatElement element, @Nullable String action) { this.element = element; this.action = action; } @NotNull public final MatterhornChatElement getElement() { return this.element; } @Nullable public final String getAction() { return this.action; } @NotNull
/*    */   public String toString() {
/* 30 */     return this.element.toString();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final MatterhornChatElement component1() {
/*    */     return this.element;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String component2() {
/*    */     return this.action;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final AgentObservation copy(@NotNull MatterhornChatElement element, @Nullable String action) {
/*    */     Intrinsics.checkNotNullParameter(element, "element");
/*    */     return new AgentObservation(element, action);
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.element.hashCode();
/*    */     return result * 31 + ((this.action == null) ? 0 : this.action.hashCode());
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof AgentObservation))
/*    */       return false; 
/*    */     AgentObservation agentObservation = (AgentObservation)other;
/*    */     return !Intrinsics.areEqual(this.element, agentObservation.element) ? false : (!!Intrinsics.areEqual(this.action, agentObservation.action));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\AgentObservation.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */