/*    */ package com.intellij.ml.llm.matterhorn.ej.core.history_processors;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.AgentObservation;
/*    */ import java.util.List;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000P\n\002\030\002\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\002\b\004\n\002\020\b\n\000\n\002\030\002\n\002\b\005\n\002\020\016\n\002\b\004\n\002\020\013\n\000\n\002\020\000\n\002\b\002\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 #2\0020\001:\002\"#B#\022\f\020\002\032\b\022\004\022\0020\0040\003\022\f\020\005\032\b\022\004\022\0020\0040\003¢\006\004\b\006\020\007B;\b\020\022\006\020\b\032\0020\t\022\016\020\002\032\n\022\004\022\0020\004\030\0010\003\022\016\020\005\032\n\022\004\022\0020\004\030\0010\003\022\b\020\n\032\004\030\0010\013¢\006\004\b\006\020\fJ\b\020\020\032\0020\021H\026J\017\020\022\032\b\022\004\022\0020\0040\003HÆ\003J\017\020\023\032\b\022\004\022\0020\0040\003HÆ\003J)\020\024\032\0020\0002\016\b\002\020\002\032\b\022\004\022\0020\0040\0032\016\b\002\020\005\032\b\022\004\022\0020\0040\003HÆ\001J\023\020\025\032\0020\0262\b\020\027\032\004\030\0010\030HÖ\003J\t\020\031\032\0020\tHÖ\001J%\020\032\032\0020\0332\006\020\034\032\0020\0002\006\020\035\032\0020\0362\006\020\037\032\0020 H\001¢\006\002\b!R\032\020\002\032\b\022\004\022\0020\0040\003X\004¢\006\b\n\000\032\004\b\r\020\016R\027\020\005\032\b\022\004\022\0020\0040\003¢\006\b\n\000\032\004\b\017\020\016¨\006$"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/Last5ObservationsResponse;", "Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/HistoryProcessorResponse;", "updatedObservations", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentObservation;", "collapsedUserMessages", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getUpdatedObservations", "()Ljava/util/List;", "getCollapsedUserMessages", "toString", "", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$ej_core", "$serializer", "Companion", "ej-core"})
/*    */ public final class Last5ObservationsResponse implements HistoryProcessorResponse {
/*    */   @NotNull
/* 10 */   public static final Companion Companion = new Companion(null); @NotNull private final List<AgentObservation> updatedObservations; @NotNull private final List<AgentObservation> collapsedUserMessages; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; static { KSerializer[] arrayOfKSerializer = new KSerializer[2]; arrayOfKSerializer[0] = (KSerializer)new ArrayListSerializer((KSerializer)AgentObservation$.serializer.INSTANCE); arrayOfKSerializer[1] = (KSerializer)new ArrayListSerializer((KSerializer)AgentObservation$.serializer.INSTANCE); $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/Last5ObservationsResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/Last5ObservationsResponse;", "ej-core"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<Last5ObservationsResponse> serializer() { return (KSerializer<Last5ObservationsResponse>)Last5ObservationsResponse.$serializer.INSTANCE; }
/*    */      }
/* 12 */    public Last5ObservationsResponse(@NotNull List<AgentObservation> updatedObservations, @NotNull List<AgentObservation> collapsedUserMessages) { this.updatedObservations = updatedObservations;
/* 13 */     this.collapsedUserMessages = collapsedUserMessages; } @NotNull public List<AgentObservation> getUpdatedObservations() { return this.updatedObservations; } @NotNull public final List<AgentObservation> getCollapsedUserMessages() { return this.collapsedUserMessages; }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/* 17 */     return "\n## " + this.collapsedUserMessages.size() + " old user messages were collapsed\n";
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final List<AgentObservation> component1() {
/*    */     return this.updatedObservations;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final List<AgentObservation> component2() {
/*    */     return this.collapsedUserMessages;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Last5ObservationsResponse copy(@NotNull List<AgentObservation> updatedObservations, @NotNull List<AgentObservation> collapsedUserMessages) {
/*    */     Intrinsics.checkNotNullParameter(updatedObservations, "updatedObservations");
/*    */     Intrinsics.checkNotNullParameter(collapsedUserMessages, "collapsedUserMessages");
/*    */     return new Last5ObservationsResponse(updatedObservations, collapsedUserMessages);
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.updatedObservations.hashCode();
/*    */     return result * 31 + this.collapsedUserMessages.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof Last5ObservationsResponse))
/*    */       return false; 
/*    */     Last5ObservationsResponse last5ObservationsResponse = (Last5ObservationsResponse)other;
/*    */     return !Intrinsics.areEqual(this.updatedObservations, last5ObservationsResponse.updatedObservations) ? false : (!!Intrinsics.areEqual(this.collapsedUserMessages, last5ObservationsResponse.collapsedUserMessages));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\history_processors\Last5ObservationsResponse.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */