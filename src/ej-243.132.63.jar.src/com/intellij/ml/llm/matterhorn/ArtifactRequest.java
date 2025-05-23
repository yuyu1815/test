/*     */ package com.intellij.ml.llm.matterhorn;
/*     */ 
/*     */ import kotlin.Metadata;
/*     */ import kotlinx.serialization.KSerializer;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\b\002\n\002\020\000\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\n\030\000*\004\b\000\020\001*\004\b\001\020\0022\0020\003B+\022\f\020\004\032\b\022\004\022\0028\0010\005\022\006\020\006\032\0028\000\022\f\020\007\032\b\022\004\022\0028\0000\b¢\006\004\b\t\020\nR\027\020\004\032\b\022\004\022\0028\0010\005¢\006\b\n\000\032\004\b\013\020\fR\023\020\006\032\0028\000¢\006\n\n\002\020\017\032\004\b\r\020\016R\027\020\007\032\b\022\004\022\0028\0000\b¢\006\b\n\000\032\004\b\020\020\021¨\006\022"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ArtifactRequest;", "I", "O", "", "artifact", "Lcom/intellij/ml/llm/matterhorn/ArtifactId;", "description", "serializer", "Lkotlinx/serialization/KSerializer;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ArtifactId;Ljava/lang/Object;Lkotlinx/serialization/KSerializer;)V", "getArtifact", "()Lcom/intellij/ml/llm/matterhorn/ArtifactId;", "getDescription", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getSerializer", "()Lkotlinx/serialization/KSerializer;", "core"})
/*     */ public final class ArtifactRequest<I, O>
/*     */ {
/*     */   @NotNull
/*     */   private final ArtifactId<O> artifact;
/*     */   private final I description;
/*     */   @NotNull
/*     */   private final KSerializer<I> serializer;
/*     */   
/*     */   public ArtifactRequest(@NotNull ArtifactId<O> artifact, Object description, @NotNull KSerializer<I> serializer) {
/* 114 */     this.artifact = artifact; this.description = (I)description; this.serializer = serializer; } @NotNull public final ArtifactId<O> getArtifact() { return this.artifact; } public final I getDescription() { return this.description; } @NotNull public final KSerializer<I> getSerializer() { return this.serializer; }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ArtifactRequest.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */