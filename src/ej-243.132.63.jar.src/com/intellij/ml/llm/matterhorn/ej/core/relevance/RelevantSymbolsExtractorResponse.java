/*    */ package com.intellij.ml.llm.matterhorn.ej.core.relevance;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import kotlinx.serialization.internal.StringSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000F\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\006\n\002\020\b\n\000\n\002\030\002\n\002\b\b\n\002\030\002\n\002\b\006\n\002\020\013\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 (2\0020\001:\002'(B'\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\003\022\006\020\006\032\0020\003¢\006\004\b\007\020\bBC\b\020\022\006\020\t\032\0020\n\022\b\020\002\032\004\030\0010\003\022\b\020\004\032\004\030\0010\003\022\b\020\005\032\004\030\0010\003\022\b\020\006\032\004\030\0010\003\022\b\020\013\032\004\030\0010\f¢\006\004\b\007\020\rJ\b\020\023\032\0020\003H\026J\b\020\024\032\004\030\0010\025J\t\020\026\032\0020\003HÆ\003J\t\020\027\032\0020\003HÆ\003J\t\020\030\032\0020\003HÆ\003J\t\020\031\032\0020\003HÆ\003J1\020\032\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0032\b\b\002\020\005\032\0020\0032\b\b\002\020\006\032\0020\003HÆ\001J\023\020\033\032\0020\0342\b\020\035\032\004\030\0010\001HÖ\003J\t\020\036\032\0020\nHÖ\001J%\020\037\032\0020 2\006\020!\032\0020\0002\006\020\"\032\0020#2\006\020$\032\0020%H\001¢\006\002\b&R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\016\020\017R\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\020\020\017R\021\020\005\032\0020\003¢\006\b\n\000\032\004\b\021\020\017R\021\020\006\032\0020\003¢\006\b\n\000\032\004\b\022\020\017¨\006)"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorResponse;", "", "relevantSymbols", "", "relevantImports", "bestRelevantFiles", "bestRelevantSymbols", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getRelevantSymbols", "()Ljava/lang/String;", "getRelevantImports", "getBestRelevantFiles", "getBestRelevantSymbols", "toString", "toUserMessage", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$ej_core", "$serializer", "Companion", "ej-core"})
/*    */ public final class RelevantSymbolsExtractorResponse {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final String relevantSymbols;
/*    */   @NotNull
/*    */   private final String relevantImports;
/*    */   @NotNull
/*    */   private final String bestRelevantFiles;
/*    */   @NotNull
/*    */   private final String bestRelevantSymbols;
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorResponse;", "ej-core"})
/*    */   public static final class Companion { private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<RelevantSymbolsExtractorResponse> serializer() {
/* 34 */       return (KSerializer<RelevantSymbolsExtractorResponse>)RelevantSymbolsExtractorResponse.$serializer.INSTANCE;
/*    */     } }
/* 36 */   public RelevantSymbolsExtractorResponse(@NotNull String relevantSymbols, @NotNull String relevantImports, @NotNull String bestRelevantFiles, @NotNull String bestRelevantSymbols) { this.relevantSymbols = relevantSymbols;
/* 37 */     this.relevantImports = relevantImports;
/* 38 */     this.bestRelevantFiles = bestRelevantFiles;
/* 39 */     this.bestRelevantSymbols = bestRelevantSymbols; } @NotNull public final String getRelevantSymbols() { return this.relevantSymbols; } @NotNull public final String getBestRelevantSymbols() { return this.bestRelevantSymbols; }
/*    */   @NotNull public final String getRelevantImports() { return this.relevantImports; }
/* 41 */   @NotNull public final String getBestRelevantFiles() { return this.bestRelevantFiles; } @NotNull public String toString() { return 
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 61 */       StringsKt.trimMargin$default("\n    |### RELEVANT SYMBOLS FROM ISSUE:\n    |```\n    |" + this.relevantSymbols + "\n    |```\n    \n    |### RELEVANT IMPORTS:\n    |```\n    |" + this.relevantImports + "\n    |```\n    \n    |### BEST RELEVANT FILES:\n    |```\n    |" + this.bestRelevantFiles + "\n    |```\n    \n    |### BEST RELEVANT SYMBOLS:\n    |```\n    |" + this.bestRelevantSymbols + "\n    |```\n    ", null, 1, null); }
/*    */   
/*    */   @Nullable
/*    */   public final MatterhornChatMessage toUserMessage() {
/* 65 */     if ((((CharSequence)this.bestRelevantSymbols).length() > 0)) {
/* 66 */       return 
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
/*    */ 
/*    */ 
/*    */ 
/*    */         
/* 84 */         MatterhornChatKt.toUserMessage("\n## RELEVANT CODE\nTo assist in solving the `<issue_description>`, please consider the following suggestions regarding useful files, classes, and methods. Use specific line numbers to `open` files at relevant parts of the code.\nIt's up to you to use these objects or skip them and search for another. \n          \n### FORMAT:\n<file_path>:: class <class_name>(<base_classes>) def <method>(<parameters>) (<line start>-<line end>)\nWhere:  \n - <file_path> is the path to the file containing the class or method.  \n - <class_name>(<base_classes>) is the name of the class together with parent classes.  \n - def <method>(<parameters>) means a method with list of parameters.  \n - if class mentioned before method it means that method belongs to this class. \n - <line start> and <line end> - first and last line numbers of class or method in the file\n \n### RELEVANT FILES, CLASSES, METHODS [Tag: RelevantCode]:\n \n" + this.bestRelevantSymbols + "\n\n");
/*    */     }
/*    */     
/* 87 */     return null;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.relevantSymbols;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component2() {
/*    */     return this.relevantImports;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component3() {
/*    */     return this.bestRelevantFiles;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component4() {
/*    */     return this.bestRelevantSymbols;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final RelevantSymbolsExtractorResponse copy(@NotNull String relevantSymbols, @NotNull String relevantImports, @NotNull String bestRelevantFiles, @NotNull String bestRelevantSymbols) {
/*    */     Intrinsics.checkNotNullParameter(relevantSymbols, "relevantSymbols");
/*    */     Intrinsics.checkNotNullParameter(relevantImports, "relevantImports");
/*    */     Intrinsics.checkNotNullParameter(bestRelevantFiles, "bestRelevantFiles");
/*    */     Intrinsics.checkNotNullParameter(bestRelevantSymbols, "bestRelevantSymbols");
/*    */     return new RelevantSymbolsExtractorResponse(relevantSymbols, relevantImports, bestRelevantFiles, bestRelevantSymbols);
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.relevantSymbols.hashCode();
/*    */     result = result * 31 + this.relevantImports.hashCode();
/*    */     result = result * 31 + this.bestRelevantFiles.hashCode();
/*    */     return result * 31 + this.bestRelevantSymbols.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof RelevantSymbolsExtractorResponse))
/*    */       return false; 
/*    */     RelevantSymbolsExtractorResponse relevantSymbolsExtractorResponse = (RelevantSymbolsExtractorResponse)other;
/*    */     return !Intrinsics.areEqual(this.relevantSymbols, relevantSymbolsExtractorResponse.relevantSymbols) ? false : (!Intrinsics.areEqual(this.relevantImports, relevantSymbolsExtractorResponse.relevantImports) ? false : (!Intrinsics.areEqual(this.bestRelevantFiles, relevantSymbolsExtractorResponse.bestRelevantFiles) ? false : (!!Intrinsics.areEqual(this.bestRelevantSymbols, relevantSymbolsExtractorResponse.bestRelevantSymbols))));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\relevance\RelevantSymbolsExtractorResponse.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */