/*    */ package com.intellij.ml.llm.matterhorn.ej.core.edit_workers;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.actions.ActionRequest;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.actions.ToolActionRequest;
/*    */ import kotlin.DeprecationLevel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.JvmField;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Reflection;
/*    */ import kotlin.reflect.KClass;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.SealedClassSerializer;
/*    */ import kotlinx.serialization.Serializable;
/*    */ import kotlinx.serialization.UnknownFieldException;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.internal.GeneratedSerializer;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000F\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\003\n\002\020\b\n\000\n\002\030\002\n\002\b\004\n\002\020\016\n\002\b\003\n\002\020\013\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 \0362\0020\001:\002\035\036B\021\022\b\020\002\032\004\030\0010\003¢\006\004\b\004\020\005B%\b\020\022\006\020\006\032\0020\007\022\b\020\002\032\004\030\0010\003\022\b\020\b\032\004\030\0010\t¢\006\004\b\004\020\nJ\b\020\r\032\0020\016H\026J\013\020\017\032\004\030\0010\003HÆ\003J\025\020\020\032\0020\0002\n\b\002\020\002\032\004\030\0010\003HÆ\001J\023\020\021\032\0020\0222\b\020\023\032\004\030\0010\001HÖ\003J\t\020\024\032\0020\007HÖ\001J%\020\025\032\0020\0262\006\020\027\032\0020\0002\006\020\030\032\0020\0312\006\020\032\032\0020\033H\001¢\006\002\b\034R\023\020\002\032\004\030\0010\003¢\006\b\n\000\032\004\b\013\020\f¨\006\037"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/EditAgentResponse;", "", "actionRequest", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getActionRequest", "()Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;", "toString", "", "component1", "copy", "equals", "", "other", "hashCode", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$ej_core", "$serializer", "Companion", "ej-core"})
/*    */ public final class EditAgentResponse {
/*    */   @NotNull
/* 30 */   public static final Companion Companion = new Companion(null); @Nullable private final ActionRequest actionRequest; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; static { KSerializer[] arrayOfKSerializer1 = new KSerializer[1]; KClass[] arrayOfKClass = new KClass[2]; arrayOfKClass[0] = Reflection.getOrCreateKotlinClass(SimpleActionRequest.class); arrayOfKClass[1] = Reflection.getOrCreateKotlinClass(ToolActionRequest.class); KSerializer[] arrayOfKSerializer2 = new KSerializer[2]; arrayOfKSerializer2[0] = (KSerializer)SimpleActionRequest$.serializer.INSTANCE; arrayOfKSerializer2[1] = (KSerializer)ToolActionRequest$.serializer.INSTANCE; arrayOfKSerializer1[0] = (KSerializer)new SealedClassSerializer("com.intellij.ml.llm.matterhorn.ej.core.actions.ActionRequest", Reflection.getOrCreateKotlinClass(ActionRequest.class), arrayOfKClass, arrayOfKSerializer2, new java.lang.annotation.Annotation[0]); $childSerializers = (KSerializer<Object>[])arrayOfKSerializer1; } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/EditAgentResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/EditAgentResponse;", "ej-core"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<EditAgentResponse> serializer() { return (KSerializer<EditAgentResponse>)EditAgentResponse.$serializer.INSTANCE; } }
/* 31 */    public EditAgentResponse(@Nullable ActionRequest actionRequest) { this.actionRequest = actionRequest; } @Nullable public final ActionRequest getActionRequest() { return this.actionRequest; } @NotNull
/*    */   public String toString() {
/* 33 */     return String.valueOf(this.actionRequest);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final ActionRequest component1() {
/*    */     return this.actionRequest;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final EditAgentResponse copy(@Nullable ActionRequest actionRequest) {
/*    */     return new EditAgentResponse(actionRequest);
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     return (this.actionRequest == null) ? 0 : this.actionRequest.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof EditAgentResponse))
/*    */       return false; 
/*    */     EditAgentResponse editAgentResponse = (EditAgentResponse)other;
/*    */     return !!Intrinsics.areEqual(this.actionRequest, editAgentResponse.actionRequest);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\edit_workers\EditAgentResponse.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */