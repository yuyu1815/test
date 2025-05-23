/*    */ package com.intellij.ml.llm.matterhorn.ej.core;
/*    */ import com.intellij.ml.llm.matterhorn.CustomArtifactEventSerializable;
/*    */ import com.intellij.ml.llm.matterhorn.EventType;
/*    */ import com.intellij.ml.llm.matterhorn.PairedGroupEvent;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.actions.ActionRequest;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.actions.SimpleActionRequest$;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.actions.ToolActionRequest;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.actions.ToolActionRequest$;
/*    */ import com.intellij.ml.llm.matterhorn.events.SerializableEvent;
/*    */ import kotlin.Deprecated;
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
/*    */ import kotlinx.serialization.SerialName;
/*    */ import kotlinx.serialization.Serializable;
/*    */ import kotlinx.serialization.UnknownFieldException;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.internal.GeneratedSerializer;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import kotlinx.serialization.internal.SerializationConstructorMarker;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable
/*    */ @SerialName("AgentActionExecutionStarted")
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000J\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\b\n\000\n\002\030\002\n\002\b\004\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\007\030\000 \0372\0020\0012\0020\002:\002\036\037B\017\022\006\020\003\032\0020\004¢\006\004\b\005\020\006B%\b\020\022\006\020\007\032\0020\b\022\b\020\003\032\004\030\0010\004\022\b\020\t\032\004\030\0010\n¢\006\004\b\005\020\013J%\020\026\032\0020\0272\006\020\030\032\0020\0002\006\020\031\032\0020\0322\006\020\033\032\0020\034H\001¢\006\002\b\035R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\f\020\rR\024\020\016\032\0020\0178VX\004¢\006\006\032\004\b\020\020\021R\024\020\022\032\0020\0238VX\004¢\006\006\032\004\b\024\020\025¨\006 "}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/AgentActionExecutionStarted;", "Lcom/intellij/ml/llm/matterhorn/CustomArtifactEventSerializable;", "Lcom/intellij/ml/llm/matterhorn/PairedGroupEvent;", "actionToExecute", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getActionToExecute", "()Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;", "groupKey", "", "getGroupKey", "()Ljava/lang/String;", "type", "Lcom/intellij/ml/llm/matterhorn/EventType;", "getType", "()Lcom/intellij/ml/llm/matterhorn/EventType;", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$ej_core", "$serializer", "Companion", "ej-core"})
/*    */ public final class AgentActionExecutionStarted implements CustomArtifactEventSerializable, PairedGroupEvent {
/*    */   @NotNull
/*    */   private final ActionRequest actionToExecute;
/*    */   @NotNull
/* 41 */   public static final Companion Companion = new Companion(null); @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; @NotNull public SerializableEvent toSerializable() { return CustomArtifactEventSerializable.DefaultImpls.toSerializable(this); } static { KSerializer[] arrayOfKSerializer1 = new KSerializer[1]; KClass[] arrayOfKClass = new KClass[2]; arrayOfKClass[0] = Reflection.getOrCreateKotlinClass(SimpleActionRequest.class); arrayOfKClass[1] = Reflection.getOrCreateKotlinClass(ToolActionRequest.class); KSerializer[] arrayOfKSerializer2 = new KSerializer[2]; arrayOfKSerializer2[0] = (KSerializer)SimpleActionRequest$.serializer.INSTANCE; arrayOfKSerializer2[1] = (KSerializer)ToolActionRequest$.serializer.INSTANCE; arrayOfKSerializer1[0] = (KSerializer)new SealedClassSerializer("com.intellij.ml.llm.matterhorn.ej.core.actions.ActionRequest", Reflection.getOrCreateKotlinClass(ActionRequest.class), arrayOfKClass, arrayOfKSerializer2, new java.lang.annotation.Annotation[0]); $childSerializers = (KSerializer<Object>[])arrayOfKSerializer1; } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/AgentActionExecutionStarted$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentActionExecutionStarted;", "ej-core"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<AgentActionExecutionStarted> serializer() { return (KSerializer<AgentActionExecutionStarted>)AgentActionExecutionStarted.$serializer.INSTANCE; }
/*    */      }
/* 43 */   public AgentActionExecutionStarted(@NotNull ActionRequest actionToExecute) { this.actionToExecute = actionToExecute; } @NotNull public final ActionRequest getActionToExecute() { return this.actionToExecute; }
/*    */   
/*    */   @NotNull
/* 46 */   public String getGroupKey() { return "agentAction"; } @NotNull
/*    */   public EventType getType() {
/* 48 */     return EventType.Start;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\AgentActionExecutionStarted.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */