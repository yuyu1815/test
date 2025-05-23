/*    */ package com.intellij.ml.llm.matterhorn.ej.core;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ import java.util.Set;
/*    */ import kotlin.DeprecationLevel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Pair;
/*    */ import kotlin.jvm.JvmField;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.Serializable;
/*    */ import kotlinx.serialization.SerializationStrategy;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.internal.ArrayListSerializer;
/*    */ import kotlinx.serialization.internal.GeneratedSerializer;
/*    */ import kotlinx.serialization.internal.IntSerializer;
/*    */ import kotlinx.serialization.internal.LinkedHashSetSerializer;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import kotlinx.serialization.internal.StringSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable
/*    */ @SerialName("AgentSessionHistory")
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000P\n\002\030\002\n\002\020\000\n\000\n\002\020\"\n\002\020\016\n\002\b\003\n\002\020$\n\002\020 \n\002\030\002\n\002\020\b\n\002\b\004\n\002\030\002\n\002\b\016\n\002\020\013\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 +2\0020\001:\002*+BW\022\f\020\002\032\b\022\004\022\0020\0040\003\022\f\020\005\032\b\022\004\022\0020\0040\003\022\f\020\006\032\b\022\004\022\0020\0040\003\022$\020\007\032 \022\004\022\0020\004\022\026\022\024\022\020\022\016\022\004\022\0020\013\022\004\022\0020\0130\n0\t0\b¢\006\004\b\f\020\rBs\b\020\022\006\020\016\032\0020\013\022\016\020\002\032\n\022\004\022\0020\004\030\0010\003\022\016\020\005\032\n\022\004\022\0020\004\030\0010\003\022\016\020\006\032\n\022\004\022\0020\004\030\0010\003\022&\020\007\032\"\022\004\022\0020\004\022\026\022\024\022\020\022\016\022\004\022\0020\013\022\004\022\0020\0130\n0\t\030\0010\b\022\b\020\017\032\004\030\0010\020¢\006\004\b\f\020\021J\b\020\030\032\0020\004H\026J\017\020\031\032\b\022\004\022\0020\0040\003HÆ\003J\017\020\032\032\b\022\004\022\0020\0040\003HÆ\003J\017\020\033\032\b\022\004\022\0020\0040\003HÆ\003J'\020\034\032 \022\004\022\0020\004\022\026\022\024\022\020\022\016\022\004\022\0020\013\022\004\022\0020\0130\n0\t0\bHÆ\003Ja\020\035\032\0020\0002\016\b\002\020\002\032\b\022\004\022\0020\0040\0032\016\b\002\020\005\032\b\022\004\022\0020\0040\0032\016\b\002\020\006\032\b\022\004\022\0020\0040\0032&\b\002\020\007\032 \022\004\022\0020\004\022\026\022\024\022\020\022\016\022\004\022\0020\013\022\004\022\0020\0130\n0\t0\bHÆ\001J\023\020\036\032\0020\0372\b\020 \032\004\030\0010\001HÖ\003J\t\020!\032\0020\013HÖ\001J%\020\"\032\0020#2\006\020$\032\0020\0002\006\020%\032\0020&2\006\020'\032\0020(H\001¢\006\002\b)R\027\020\002\032\b\022\004\022\0020\0040\003¢\006\b\n\000\032\004\b\022\020\023R\027\020\005\032\b\022\004\022\0020\0040\003¢\006\b\n\000\032\004\b\024\020\023R\027\020\006\032\b\022\004\022\0020\0040\003¢\006\b\n\000\032\004\b\025\020\023R/\020\007\032 \022\004\022\0020\004\022\026\022\024\022\020\022\016\022\004\022\0020\013\022\004\022\0020\0130\n0\t0\b¢\006\b\n\000\032\004\b\026\020\027¨\006,"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistorySnapshot;", "", "viewedFiles", "", "", "viewedImports", "createdFiles", "shownCode", "", "", "Lkotlin/Pair;", "", "<init>", "(Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;Ljava/util/Map;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/Set;Ljava/util/Set;Ljava/util/Set;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getViewedFiles", "()Ljava/util/Set;", "getViewedImports", "getCreatedFiles", "getShownCode", "()Ljava/util/Map;", "toString", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$ej_core", "$serializer", "Companion", "ej-core"})
/*    */ public final class AgentSessionHistorySnapshot {
/*    */   @NotNull
/* 33 */   public static final Companion Companion = new Companion(null); @NotNull private final Set<String> viewedFiles; @NotNull private final Set<String> viewedImports; @NotNull private final Set<String> createdFiles; @NotNull private final Map<String, List<Pair<Integer, Integer>>> shownCode; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; static { KSerializer[] arrayOfKSerializer = new KSerializer[4]; arrayOfKSerializer[0] = (KSerializer)new LinkedHashSetSerializer((KSerializer)StringSerializer.INSTANCE); arrayOfKSerializer[1] = (KSerializer)new LinkedHashSetSerializer((KSerializer)StringSerializer.INSTANCE); arrayOfKSerializer[2] = (KSerializer)new LinkedHashSetSerializer((KSerializer)StringSerializer.INSTANCE); arrayOfKSerializer[3] = (KSerializer)new LinkedHashMapSerializer((KSerializer)StringSerializer.INSTANCE, (KSerializer)new ArrayListSerializer((KSerializer)new PairSerializer((KSerializer)IntSerializer.INSTANCE, (KSerializer)IntSerializer.INSTANCE))); $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistorySnapshot$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistorySnapshot;", "ej-core"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<AgentSessionHistorySnapshot> serializer() { return (KSerializer<AgentSessionHistorySnapshot>)AgentSessionHistorySnapshot.$serializer.INSTANCE; }
/*    */      }
/*    */   
/* 36 */   public AgentSessionHistorySnapshot(@NotNull Set<String> viewedFiles, @NotNull Set<String> viewedImports, @NotNull Set<String> createdFiles, @NotNull Map<String, List<Pair<Integer, Integer>>> shownCode) { this.viewedFiles = viewedFiles;
/* 37 */     this.viewedImports = viewedImports;
/* 38 */     this.createdFiles = createdFiles;
/* 39 */     this.shownCode = shownCode; } @NotNull public final Set<String> getViewedFiles() { return this.viewedFiles; } @NotNull public final Map<String, List<Pair<Integer, Integer>>> getShownCode() { return this.shownCode; }
/*    */   @NotNull public final Set<String> getViewedImports() { return this.viewedImports; }
/*    */   @NotNull public final Set<String> getCreatedFiles() { return this.createdFiles; } @NotNull
/* 42 */   public String toString() { return "AgentSessionHistorySnapshot(viewedFiles=" + this.viewedFiles + ", viewedImports=" + this.viewedImports + ", createdFiles=" + this.createdFiles + ", shownCode=" + this.shownCode + ")"; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final Set<String> component1() {
/*    */     return this.viewedFiles;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Set<String> component2() {
/*    */     return this.viewedImports;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Set<String> component3() {
/*    */     return this.createdFiles;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Map<String, List<Pair<Integer, Integer>>> component4() {
/*    */     return this.shownCode;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final AgentSessionHistorySnapshot copy(@NotNull Set<String> viewedFiles, @NotNull Set<String> viewedImports, @NotNull Set<String> createdFiles, @NotNull Map<String, ? extends List<Pair<Integer, Integer>>> shownCode) {
/*    */     Intrinsics.checkNotNullParameter(viewedFiles, "viewedFiles");
/*    */     Intrinsics.checkNotNullParameter(viewedImports, "viewedImports");
/*    */     Intrinsics.checkNotNullParameter(createdFiles, "createdFiles");
/*    */     Intrinsics.checkNotNullParameter(shownCode, "shownCode");
/*    */     return new AgentSessionHistorySnapshot(viewedFiles, viewedImports, createdFiles, shownCode);
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.viewedFiles.hashCode();
/*    */     result = result * 31 + this.viewedImports.hashCode();
/*    */     result = result * 31 + this.createdFiles.hashCode();
/*    */     return result * 31 + this.shownCode.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof AgentSessionHistorySnapshot))
/*    */       return false; 
/*    */     AgentSessionHistorySnapshot agentSessionHistorySnapshot = (AgentSessionHistorySnapshot)other;
/*    */     return !Intrinsics.areEqual(this.viewedFiles, agentSessionHistorySnapshot.viewedFiles) ? false : (!Intrinsics.areEqual(this.viewedImports, agentSessionHistorySnapshot.viewedImports) ? false : (!Intrinsics.areEqual(this.createdFiles, agentSessionHistorySnapshot.createdFiles) ? false : (!!Intrinsics.areEqual(this.shownCode, agentSessionHistorySnapshot.shownCode))));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\AgentSessionHistorySnapshot.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */