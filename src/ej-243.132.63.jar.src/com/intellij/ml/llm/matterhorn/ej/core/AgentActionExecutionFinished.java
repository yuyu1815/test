/*    */ package com.intellij.ml.llm.matterhorn.ej.core;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.CustomArtifactEventSerializable;
/*    */ import com.intellij.ml.llm.matterhorn.EventType;
/*    */ import com.intellij.ml.llm.matterhorn.PairedGroupEvent;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.actions.ActionRequest;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.actions.SimpleActionRequest;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.actions.SimpleActionRequest$;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.actions.ToolActionRequest;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.actions.ToolActionRequest$;
/*    */ import com.intellij.ml.llm.matterhorn.events.SerializableEvent;
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.DeprecationLevel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.JvmField;
/*    */ import kotlin.jvm.JvmStatic;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Reflection;
/*    */ import kotlin.reflect.KClass;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.SealedClassSerializer;
/*    */ import kotlinx.serialization.SerialName;
/*    */ import kotlinx.serialization.Serializable;
/*    */ import kotlinx.serialization.SerializationStrategy;
/*    */ import kotlinx.serialization.UnknownFieldException;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.internal.GeneratedSerializer;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import kotlinx.serialization.internal.SerializationConstructorMarker;
/*    */ import kotlinx.serialization.internal.StringSerializer;
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
/*    */ @Serializable
/*    */ @SerialName("AgentActionExecutionFinished")
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000H\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\003\n\002\020\b\n\000\n\002\030\002\n\002\b\b\n\002\030\002\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\007\030\000 !2\0020\0012\0020\002:\002 !B\027\022\006\020\003\032\0020\004\022\006\020\005\032\0020\006¢\006\004\b\007\020\bB/\b\020\022\006\020\t\032\0020\n\022\b\020\003\032\004\030\0010\004\022\b\020\005\032\004\030\0010\006\022\b\020\013\032\004\030\0010\f¢\006\004\b\007\020\rJ%\020\030\032\0020\0312\006\020\032\032\0020\0002\006\020\033\032\0020\0342\006\020\035\032\0020\036H\001¢\006\002\b\037R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\016\020\017R\021\020\005\032\0020\006¢\006\b\n\000\032\004\b\020\020\021R\024\020\022\032\0020\0068VX\004¢\006\006\032\004\b\023\020\021R\024\020\024\032\0020\0258VX\004¢\006\006\032\004\b\026\020\027¨\006\""}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/AgentActionExecutionFinished;", "Lcom/intellij/ml/llm/matterhorn/CustomArtifactEventSerializable;", "Lcom/intellij/ml/llm/matterhorn/PairedGroupEvent;", "actionToExecute", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;", "result", "", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getActionToExecute", "()Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;", "getResult", "()Ljava/lang/String;", "groupKey", "getGroupKey", "type", "Lcom/intellij/ml/llm/matterhorn/EventType;", "getType", "()Lcom/intellij/ml/llm/matterhorn/EventType;", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$ej_core", "$serializer", "Companion", "ej-core"})
/*    */ public final class AgentActionExecutionFinished
/*    */   implements CustomArtifactEventSerializable, PairedGroupEvent
/*    */ {
/*    */   @NotNull
/*    */   private final ActionRequest actionToExecute;
/*    */   @NotNull
/*    */   private final String result;
/*    */   @NotNull
/* 62 */   public static final Companion Companion = new Companion(null); @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; @NotNull public SerializableEvent toSerializable() { return CustomArtifactEventSerializable.DefaultImpls.toSerializable(this); } static { KSerializer[] arrayOfKSerializer1 = new KSerializer[2]; KClass[] arrayOfKClass = new KClass[2]; arrayOfKClass[0] = Reflection.getOrCreateKotlinClass(SimpleActionRequest.class); arrayOfKClass[1] = Reflection.getOrCreateKotlinClass(ToolActionRequest.class); KSerializer[] arrayOfKSerializer2 = new KSerializer[2]; arrayOfKSerializer2[0] = (KSerializer)SimpleActionRequest$.serializer.INSTANCE; arrayOfKSerializer2[1] = (KSerializer)ToolActionRequest$.serializer.INSTANCE; arrayOfKSerializer1[0] = (KSerializer)new SealedClassSerializer("com.intellij.ml.llm.matterhorn.ej.core.actions.ActionRequest", Reflection.getOrCreateKotlinClass(ActionRequest.class), arrayOfKClass, arrayOfKSerializer2, new java.lang.annotation.Annotation[0]); arrayOfKSerializer1[1] = null; $childSerializers = (KSerializer<Object>[])arrayOfKSerializer1; } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/AgentActionExecutionFinished$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentActionExecutionFinished;", "ej-core"}) public static final class Companion { @NotNull public final KSerializer<AgentActionExecutionFinished> serializer() { return (KSerializer<AgentActionExecutionFinished>)AgentActionExecutionFinished.$serializer.INSTANCE; }
/*    */      private Companion() {} } public AgentActionExecutionFinished(@NotNull ActionRequest actionToExecute, @NotNull String result) {
/* 64 */     this.actionToExecute = actionToExecute; this.result = result; } @NotNull public final ActionRequest getActionToExecute() { return this.actionToExecute; } @NotNull public final String getResult() { return this.result; }
/*    */   
/*    */   @NotNull
/* 67 */   public String getGroupKey() { return "agentAction"; } @NotNull
/*    */   public EventType getType() {
/* 69 */     return EventType.End;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\AgentActionExecutionFinished.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */