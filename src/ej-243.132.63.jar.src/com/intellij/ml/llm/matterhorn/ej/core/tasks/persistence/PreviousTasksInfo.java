/*    */ package com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.AgentSessionHistorySnapshot;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.AgentSessionHistorySnapshot$;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.AgentState;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.AgentState$;
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.DeprecationLevel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.JvmStatic;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.Serializable;
/*    */ import kotlinx.serialization.SerializationStrategy;
/*    */ import kotlinx.serialization.UnknownFieldException;
/*    */ import kotlinx.serialization.builtins.BuiltinSerializersKt;
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
/*    */ import org.jetbrains.annotations.Nullable;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\003\n\002\020\b\n\000\n\002\030\002\n\002\b\b\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\007\030\000 \0362\0020\001:\002\035\036B%\022\b\020\002\032\004\030\0010\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007¢\006\004\b\b\020\tB9\b\020\022\006\020\n\032\0020\013\022\b\020\002\032\004\030\0010\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\b\020\f\032\004\030\0010\r¢\006\004\b\b\020\016J%\020\025\032\0020\0262\006\020\027\032\0020\0002\006\020\030\032\0020\0312\006\020\032\032\0020\033H\001¢\006\002\b\034R\023\020\002\032\004\030\0010\003¢\006\b\n\000\032\004\b\017\020\020R\023\020\004\032\004\030\0010\005¢\006\b\n\000\032\004\b\021\020\022R\023\020\006\032\004\030\0010\007¢\006\b\n\000\032\004\b\023\020\024¨\006\037"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/PreviousTasksInfo;", "", "agentState", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;", "patch", "", "sessionHistory", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistorySnapshot;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistorySnapshot;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/intellij/ml/llm/matterhorn/ej/core/AgentState;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistorySnapshot;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getAgentState", "()Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;", "getPatch", "()Ljava/lang/String;", "getSessionHistory", "()Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistorySnapshot;", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$ej_core", "$serializer", "Companion", "ej-core"})
/*    */ public final class PreviousTasksInfo
/*    */ {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @Nullable
/*    */   private final AgentState agentState;
/*    */   @Nullable
/*    */   private final String patch;
/*    */   @Nullable
/*    */   private final AgentSessionHistorySnapshot sessionHistory;
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/PreviousTasksInfo$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/PreviousTasksInfo;", "ej-core"})
/*    */   public static final class Companion
/*    */   {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<PreviousTasksInfo> serializer() {
/* 59 */       return (KSerializer<PreviousTasksInfo>)PreviousTasksInfo.$serializer.INSTANCE;
/*    */     } }
/*    */   
/* 62 */   public PreviousTasksInfo(@Nullable AgentState agentState, @Nullable String patch, @Nullable AgentSessionHistorySnapshot sessionHistory) { this.agentState = agentState;
/* 63 */     this.patch = patch;
/* 64 */     this.sessionHistory = sessionHistory; } @Nullable public final AgentSessionHistorySnapshot getSessionHistory() { return this.sessionHistory; }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public final AgentState getAgentState() {
/*    */     return this.agentState;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String getPatch() {
/*    */     return this.patch;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\tasks\persistence\PreviousTasksInfo.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */