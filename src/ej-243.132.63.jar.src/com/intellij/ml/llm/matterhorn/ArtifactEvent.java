/*    */ package com.intellij.ml.llm.matterhorn;@Serializable(with = ArtifactEventSerializer.class)
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000H\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\003\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\002\b\005\n\002\030\002\n\000\n\002\030\002\n\002\b\027\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\003\b\b\030\000 12\0020\001:\0011BU\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\005\022\006\020\007\032\0020\005\022\006\020\b\032\0020\t\022\f\020\n\032\b\022\004\022\0020\f0\013\022\n\b\002\020\r\032\004\030\0010\005\022\n\b\002\020\016\032\004\030\0010\005¢\006\004\b\017\020\020B5\b\026\022\006\020\002\032\0020\003\022\006\020\021\032\0020\022\022\016\b\002\020\023\032\b\022\002\b\003\030\0010\024\022\n\b\002\020\016\032\004\030\0010\005¢\006\004\b\017\020\025J\t\020\"\032\0020\003HÆ\003J\t\020#\032\0020\005HÆ\003J\t\020$\032\0020\005HÆ\003J\t\020%\032\0020\005HÆ\003J\t\020&\032\0020\tHÆ\003J\017\020'\032\b\022\004\022\0020\f0\013HÆ\003J\013\020(\032\004\030\0010\005HÆ\003J\013\020)\032\004\030\0010\005HÆ\003Jc\020*\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0052\b\b\002\020\007\032\0020\0052\b\b\002\020\b\032\0020\t2\016\b\002\020\n\032\b\022\004\022\0020\f0\0132\n\b\002\020\r\032\004\030\0010\0052\n\b\002\020\016\032\004\030\0010\005HÆ\001J\023\020+\032\0020,2\b\020-\032\004\030\0010\001HÖ\003J\t\020.\032\0020/HÖ\001J\t\0200\032\0020\005HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\026\020\027R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\030\020\031R\021\020\006\032\0020\005¢\006\b\n\000\032\004\b\032\020\031R\021\020\007\032\0020\005¢\006\b\n\000\032\004\b\033\020\031R\021\020\b\032\0020\t¢\006\b\n\000\032\004\b\034\020\035R\027\020\n\032\b\022\004\022\0020\f0\013¢\006\b\n\000\032\004\b\036\020\037R\023\020\r\032\004\030\0010\005¢\006\b\n\000\032\004\b \020\031R\023\020\016\032\004\030\0010\005¢\006\b\n\000\032\004\b!\020\031¨\0062"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ArtifactEvent;", "", "status", "Lcom/intellij/ml/llm/matterhorn/ArtifactStatus;", "id", "", "type", "title", "statistics", "Lcom/intellij/ml/llm/matterhorn/ArtifactStatistic;", "dependencies", "", "Lcom/intellij/ml/llm/matterhorn/ArtifactDependency;", "requesterId", "errorMessage", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ArtifactStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ArtifactStatistic;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "artifact", "Lcom/intellij/ml/llm/matterhorn/Artifactual;", "requester", "Lcom/intellij/ml/llm/matterhorn/ArtifactId;", "(Lcom/intellij/ml/llm/matterhorn/ArtifactStatus;Lcom/intellij/ml/llm/matterhorn/Artifactual;Lcom/intellij/ml/llm/matterhorn/ArtifactId;Ljava/lang/String;)V", "getStatus", "()Lcom/intellij/ml/llm/matterhorn/ArtifactStatus;", "getId", "()Ljava/lang/String;", "getType", "getTitle", "getStatistics", "()Lcom/intellij/ml/llm/matterhorn/ArtifactStatistic;", "getDependencies", "()Ljava/util/List;", "getRequesterId", "getErrorMessage", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "core"})
/*    */ public final class ArtifactEvent { @NotNull
/*    */   public static final Companion Companion = new Companion(null); @NotNull
/*    */   private final ArtifactStatus status; @NotNull
/*    */   private final String id; @NotNull
/*    */   private final String type;
/*    */   @NotNull
/*    */   private final String title;
/*    */   @NotNull
/*    */   private final ArtifactStatistic statistics;
/*    */   @NotNull
/*    */   private final List<ArtifactDependency> dependencies;
/*    */   @Nullable
/*    */   private final String requesterId;
/*    */   @Nullable
/*    */   private final String errorMessage;
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ArtifactEvent$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/ArtifactEvent;", "core"})
/*    */   public static final class Companion { private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<ArtifactEvent> serializer() {
/* 24 */       return new ArtifactEventSerializer();
/*    */     } }
/* 26 */   public ArtifactEvent(@NotNull ArtifactStatus status, @NotNull String id, @NotNull String type, @NotNull String title, @NotNull ArtifactStatistic statistics, @NotNull List<ArtifactDependency> dependencies, @Nullable String requesterId, @Nullable String errorMessage) { this.status = status;
/* 27 */     this.id = id;
/* 28 */     this.type = type;
/* 29 */     this.title = title;
/* 30 */     this.statistics = statistics;
/* 31 */     this.dependencies = dependencies;
/* 32 */     this.requesterId = requesterId;
/* 33 */     this.errorMessage = errorMessage; } @NotNull public final ArtifactStatus getStatus() { return this.status; } @NotNull public final String getId() { return this.id; } @NotNull public final String getType() { return this.type; } @Nullable public final String getErrorMessage() { return this.errorMessage; }
/*    */   @NotNull public final String getTitle() { return this.title; }
/*    */   @NotNull public final ArtifactStatistic getStatistics() { return this.statistics; }
/* 36 */   @NotNull public final List<ArtifactDependency> getDependencies() { return this.dependencies; } @Nullable public final String getRequesterId() { return this.requesterId; } public ArtifactEvent(@NotNull ArtifactStatus status, @NotNull Artifactual artifact, @Nullable ArtifactId requester, @Nullable String errorMessage) { this(
/* 37 */         status, 
/* 38 */         artifact.getId().toFileName(), 
/* 39 */         artifact.getId().getType().getName(), 
/* 40 */         ArtifactEventKt.access$getArtifactTitle(artifact), 
/* 41 */         artifact.getStatistics(), 
/* 42 */         artifact.getDependencies(), 
/* 43 */         (requester != null) ? requester.toFileName() : null, 
/* 44 */         errorMessage); }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final ArtifactStatus component1() {
/*    */     return this.status;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component2() {
/*    */     return this.id;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component3() {
/*    */     return this.type;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component4() {
/*    */     return this.title;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final ArtifactStatistic component5() {
/*    */     return this.statistics;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final List<ArtifactDependency> component6() {
/*    */     return this.dependencies;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String component7() {
/*    */     return this.requesterId;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String component8() {
/*    */     return this.errorMessage;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final ArtifactEvent copy(@NotNull ArtifactStatus status, @NotNull String id, @NotNull String type, @NotNull String title, @NotNull ArtifactStatistic statistics, @NotNull List<ArtifactDependency> dependencies, @Nullable String requesterId, @Nullable String errorMessage) {
/*    */     Intrinsics.checkNotNullParameter(status, "status");
/*    */     Intrinsics.checkNotNullParameter(id, "id");
/*    */     Intrinsics.checkNotNullParameter(type, "type");
/*    */     Intrinsics.checkNotNullParameter(title, "title");
/*    */     Intrinsics.checkNotNullParameter(statistics, "statistics");
/*    */     Intrinsics.checkNotNullParameter(dependencies, "dependencies");
/*    */     return new ArtifactEvent(status, id, type, title, statistics, dependencies, requesterId, errorMessage);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "ArtifactEvent(status=" + this.status + ", id=" + this.id + ", type=" + this.type + ", title=" + this.title + ", statistics=" + this.statistics + ", dependencies=" + this.dependencies + ", requesterId=" + this.requesterId + ", errorMessage=" + this.errorMessage + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.status.hashCode();
/*    */     result = result * 31 + this.id.hashCode();
/*    */     result = result * 31 + this.type.hashCode();
/*    */     result = result * 31 + this.title.hashCode();
/*    */     result = result * 31 + this.statistics.hashCode();
/*    */     result = result * 31 + this.dependencies.hashCode();
/*    */     result = result * 31 + ((this.requesterId == null) ? 0 : this.requesterId.hashCode());
/*    */     return result * 31 + ((this.errorMessage == null) ? 0 : this.errorMessage.hashCode());
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof ArtifactEvent))
/*    */       return false; 
/*    */     ArtifactEvent artifactEvent = (ArtifactEvent)other;
/*    */     return (this.status != artifactEvent.status) ? false : (!Intrinsics.areEqual(this.id, artifactEvent.id) ? false : (!Intrinsics.areEqual(this.type, artifactEvent.type) ? false : (!Intrinsics.areEqual(this.title, artifactEvent.title) ? false : (!Intrinsics.areEqual(this.statistics, artifactEvent.statistics) ? false : (!Intrinsics.areEqual(this.dependencies, artifactEvent.dependencies) ? false : (!Intrinsics.areEqual(this.requesterId, artifactEvent.requesterId) ? false : (!!Intrinsics.areEqual(this.errorMessage, artifactEvent.errorMessage))))))));
/*    */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ArtifactEvent.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */