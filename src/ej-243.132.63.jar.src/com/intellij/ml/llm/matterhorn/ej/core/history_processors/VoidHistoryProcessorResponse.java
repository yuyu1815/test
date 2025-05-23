/*    */ package com.intellij.ml.llm.matterhorn.ej.core.history_processors;
/*    */ import java.util.List;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000P\n\002\030\002\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\002\b\003\n\002\020\b\n\000\n\002\030\002\n\002\b\004\n\002\020\016\n\002\b\003\n\002\020\013\n\000\n\002\020\000\n\002\b\002\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000  2\0020\001:\002\037 B\025\022\f\020\002\032\b\022\004\022\0020\0040\003¢\006\004\b\005\020\006B+\b\020\022\006\020\007\032\0020\b\022\016\020\002\032\n\022\004\022\0020\004\030\0010\003\022\b\020\t\032\004\030\0010\n¢\006\004\b\005\020\013J\b\020\016\032\0020\017H\026J\017\020\020\032\b\022\004\022\0020\0040\003HÆ\003J\031\020\021\032\0020\0002\016\b\002\020\002\032\b\022\004\022\0020\0040\003HÆ\001J\023\020\022\032\0020\0232\b\020\024\032\004\030\0010\025HÖ\003J\t\020\026\032\0020\bHÖ\001J%\020\027\032\0020\0302\006\020\031\032\0020\0002\006\020\032\032\0020\0332\006\020\034\032\0020\035H\001¢\006\002\b\036R\032\020\002\032\b\022\004\022\0020\0040\003X\004¢\006\b\n\000\032\004\b\f\020\r¨\006!"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/VoidHistoryProcessorResponse;", "Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/HistoryProcessorResponse;", "updatedObservations", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentObservation;", "<init>", "(Ljava/util/List;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getUpdatedObservations", "()Ljava/util/List;", "toString", "", "component1", "copy", "equals", "", "other", "", "hashCode", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$ej_core", "$serializer", "Companion", "ej-core"})
/*    */ public final class VoidHistoryProcessorResponse implements HistoryProcessorResponse {
/*    */   @NotNull
/*  9 */   public static final Companion Companion = new Companion(null); @NotNull private final List<AgentObservation> updatedObservations; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; static { KSerializer[] arrayOfKSerializer = new KSerializer[1]; arrayOfKSerializer[0] = (KSerializer)new ArrayListSerializer((KSerializer)AgentObservation$.serializer.INSTANCE); $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/VoidHistoryProcessorResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/VoidHistoryProcessorResponse;", "ej-core"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<VoidHistoryProcessorResponse> serializer() { return (KSerializer<VoidHistoryProcessorResponse>)VoidHistoryProcessorResponse.$serializer.INSTANCE; }
/*    */      }
/* 11 */    public VoidHistoryProcessorResponse(@NotNull List<AgentObservation> updatedObservations) { this.updatedObservations = updatedObservations; } @NotNull public List<AgentObservation> getUpdatedObservations() { return this.updatedObservations; }
/*    */    @NotNull
/*    */   public String toString() {
/* 14 */     return "\n## This is a void HistoryProcessor that does nothing\n";
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final List<AgentObservation> component1() {
/*    */     return this.updatedObservations;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final VoidHistoryProcessorResponse copy(@NotNull List<AgentObservation> updatedObservations) {
/*    */     Intrinsics.checkNotNullParameter(updatedObservations, "updatedObservations");
/*    */     return new VoidHistoryProcessorResponse(updatedObservations);
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     return this.updatedObservations.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof VoidHistoryProcessorResponse))
/*    */       return false; 
/*    */     VoidHistoryProcessorResponse voidHistoryProcessorResponse = (VoidHistoryProcessorResponse)other;
/*    */     return !!Intrinsics.areEqual(this.updatedObservations, voidHistoryProcessorResponse.updatedObservations);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\history_processors\VoidHistoryProcessorResponse.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */