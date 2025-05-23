/*    */ package com.intellij.ml.llm.matterhorn;@Serializable @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000>\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\007\n\002\020\b\n\000\n\002\030\002\n\002\b\024\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 /2\0020\001:\002./B3\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\003\022\006\020\006\032\0020\003\022\n\b\002\020\007\032\004\030\0010\003¢\006\004\b\b\020\tBM\b\020\022\006\020\n\032\0020\013\022\b\020\002\032\004\030\0010\003\022\b\020\004\032\004\030\0010\003\022\b\020\005\032\004\030\0010\003\022\b\020\006\032\004\030\0010\003\022\b\020\007\032\004\030\0010\003\022\b\020\f\032\004\030\0010\r¢\006\004\b\b\020\016J\t\020\033\032\0020\003HÆ\003J\t\020\034\032\0020\003HÆ\003J\t\020\035\032\0020\003HÆ\003J\t\020\036\032\0020\003HÆ\003J\013\020\037\032\004\030\0010\003HÆ\003J=\020 \032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0032\b\b\002\020\005\032\0020\0032\b\b\002\020\006\032\0020\0032\n\b\002\020\007\032\004\030\0010\003HÆ\001J\023\020!\032\0020\"2\b\020#\032\004\030\0010\001HÖ\003J\t\020$\032\0020\013HÖ\001J\t\020%\032\0020\003HÖ\001J%\020&\032\0020'2\006\020(\032\0020\0002\006\020)\032\0020*2\006\020+\032\0020,H\001¢\006\002\b-R\034\020\002\032\0020\0038\006X\004¢\006\016\n\000\022\004\b\017\020\020\032\004\b\021\020\022R\034\020\004\032\0020\0038\006X\004¢\006\016\n\000\022\004\b\023\020\020\032\004\b\024\020\022R\034\020\005\032\0020\0038\006X\004¢\006\016\n\000\022\004\b\025\020\020\032\004\b\026\020\022R\034\020\006\032\0020\0038\006X\004¢\006\016\n\000\022\004\b\027\020\020\032\004\b\030\020\022R\036\020\007\032\004\030\0010\0038\006X\004¢\006\016\n\000\022\004\b\031\020\020\032\004\b\032\020\022¨\0060"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/TrajectoryElementAgent;", "", "agentType", "", "agentVersion", "agentModelVersion", "agentConfiguration", "agentId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getAgentType$annotations", "()V", "getAgentType", "()Ljava/lang/String;", "getAgentVersion$annotations", "getAgentVersion", "getAgentModelVersion$annotations", "getAgentModelVersion", "getAgentConfiguration$annotations", "getAgentConfiguration", "getAgentId$annotations", "getAgentId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$core", "$serializer", "Companion", "core"}) public final class TrajectoryElementAgent { @NotNull
/*    */   public static final Companion Companion = new Companion(null); @NotNull
/*    */   private final String agentType; @NotNull
/*    */   private final String agentVersion; @NotNull
/*    */   private final String agentModelVersion; @NotNull
/*    */   private final String agentConfiguration; @Nullable
/*    */   private final String agentId; @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/TrajectoryElementAgent$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/TrajectoryElementAgent;", "core"})
/*    */   public static final class Companion { @NotNull
/*  9 */     public final KSerializer<TrajectoryElementAgent> serializer() { return (KSerializer<TrajectoryElementAgent>)TrajectoryElementAgent.$serializer.INSTANCE; }
/*    */      private Companion() {} } public TrajectoryElementAgent(@NotNull String agentType, @NotNull String agentVersion, @NotNull String agentModelVersion, @NotNull String agentConfiguration, @Nullable String agentId) {
/* 11 */     this.agentType = agentType;
/*    */     
/* 13 */     this.agentVersion = agentVersion;
/*    */     
/* 15 */     this.agentModelVersion = agentModelVersion;
/*    */     
/* 17 */     this.agentConfiguration = agentConfiguration;
/*    */     
/* 19 */     this.agentId = agentId; } @NotNull public final String getAgentType() { return this.agentType; } @NotNull public final String getAgentVersion() { return this.agentVersion; } @NotNull public final String getAgentModelVersion() { return this.agentModelVersion; } @NotNull public final String getAgentConfiguration() { return this.agentConfiguration; } @Nullable public final String getAgentId() { return this.agentId; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.agentType;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component2() {
/*    */     return this.agentVersion;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component3() {
/*    */     return this.agentModelVersion;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component4() {
/*    */     return this.agentConfiguration;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String component5() {
/*    */     return this.agentId;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final TrajectoryElementAgent copy(@NotNull String agentType, @NotNull String agentVersion, @NotNull String agentModelVersion, @NotNull String agentConfiguration, @Nullable String agentId) {
/*    */     Intrinsics.checkNotNullParameter(agentType, "agentType");
/*    */     Intrinsics.checkNotNullParameter(agentVersion, "agentVersion");
/*    */     Intrinsics.checkNotNullParameter(agentModelVersion, "agentModelVersion");
/*    */     Intrinsics.checkNotNullParameter(agentConfiguration, "agentConfiguration");
/*    */     return new TrajectoryElementAgent(agentType, agentVersion, agentModelVersion, agentConfiguration, agentId);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "TrajectoryElementAgent(agentType=" + this.agentType + ", agentVersion=" + this.agentVersion + ", agentModelVersion=" + this.agentModelVersion + ", agentConfiguration=" + this.agentConfiguration + ", agentId=" + this.agentId + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.agentType.hashCode();
/*    */     result = result * 31 + this.agentVersion.hashCode();
/*    */     result = result * 31 + this.agentModelVersion.hashCode();
/*    */     result = result * 31 + this.agentConfiguration.hashCode();
/*    */     return result * 31 + ((this.agentId == null) ? 0 : this.agentId.hashCode());
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof TrajectoryElementAgent))
/*    */       return false; 
/*    */     TrajectoryElementAgent trajectoryElementAgent = (TrajectoryElementAgent)other;
/*    */     return !Intrinsics.areEqual(this.agentType, trajectoryElementAgent.agentType) ? false : (!Intrinsics.areEqual(this.agentVersion, trajectoryElementAgent.agentVersion) ? false : (!Intrinsics.areEqual(this.agentModelVersion, trajectoryElementAgent.agentModelVersion) ? false : (!Intrinsics.areEqual(this.agentConfiguration, trajectoryElementAgent.agentConfiguration) ? false : (!!Intrinsics.areEqual(this.agentId, trajectoryElementAgent.agentId)))));
/*    */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\TrajectoryElementAgent.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */