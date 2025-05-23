/*    */ package com.intellij.ml.llm.matterhorn.ej.core.relevance;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.AgentIssue;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.AgentIssue$;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\003\n\002\020\b\n\000\n\002\030\002\n\002\b\006\n\002\020\013\n\002\b\003\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 \0362\0020\001:\002\035\036B\021\022\b\b\002\020\002\032\0020\003¢\006\004\b\004\020\005B%\b\020\022\006\020\006\032\0020\007\022\b\020\002\032\004\030\0010\003\022\b\020\b\032\004\030\0010\t¢\006\004\b\004\020\nJ\t\020\r\032\0020\003HÆ\003J\023\020\016\032\0020\0002\b\b\002\020\002\032\0020\003HÆ\001J\023\020\017\032\0020\0202\b\020\021\032\004\030\0010\001HÖ\003J\t\020\022\032\0020\007HÖ\001J\t\020\023\032\0020\024HÖ\001J%\020\025\032\0020\0262\006\020\027\032\0020\0002\006\020\030\032\0020\0312\006\020\032\032\0020\033H\001¢\006\002\b\034R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\013\020\f¨\006\037"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorInput;", "", "issue", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentIssue;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/core/AgentIssue;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/intellij/ml/llm/matterhorn/ej/core/AgentIssue;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getIssue", "()Lcom/intellij/ml/llm/matterhorn/ej/core/AgentIssue;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$ej_core", "$serializer", "Companion", "ej-core"})
/*    */ public final class RelevantSymbolsExtractorInput {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final AgentIssue issue;
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorInput$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorInput;", "ej-core"})
/*    */   public static final class Companion { @NotNull
/*    */     public final KSerializer<RelevantSymbolsExtractorInput> serializer() {
/* 29 */       return (KSerializer<RelevantSymbolsExtractorInput>)RelevantSymbolsExtractorInput.$serializer.INSTANCE;
/*    */     } private Companion() {} } public RelevantSymbolsExtractorInput(@NotNull AgentIssue issue) {
/* 31 */     this.issue = issue; } @NotNull public final AgentIssue getIssue() { return this.issue; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final AgentIssue component1() {
/*    */     return this.issue;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final RelevantSymbolsExtractorInput copy(@NotNull AgentIssue issue) {
/*    */     Intrinsics.checkNotNullParameter(issue, "issue");
/*    */     return new RelevantSymbolsExtractorInput(issue);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "RelevantSymbolsExtractorInput(issue=" + this.issue + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     return this.issue.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof RelevantSymbolsExtractorInput))
/*    */       return false; 
/*    */     RelevantSymbolsExtractorInput relevantSymbolsExtractorInput = (RelevantSymbolsExtractorInput)other;
/*    */     return !!Intrinsics.areEqual(this.issue, relevantSymbolsExtractorInput.issue);
/*    */   }
/*    */   
/*    */   public RelevantSymbolsExtractorInput() {
/*    */     this((AgentIssue)null, 1, (DefaultConstructorMarker)null);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\relevance\RelevantSymbolsExtractorInput.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */