/*   */ package ai.grazie.tasks.provider.prompt.velocity.resources.model;@Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\020\000\n\000\n\002\020\006\n\000\n\002\020\t\n\000\n\002\020\016\n\002\b\026\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001BC\022\n\b\002\020\002\032\004\030\0010\003\022\n\b\002\020\004\032\004\030\0010\005\022\n\b\002\020\006\032\004\030\0010\007\022\n\b\002\020\b\032\004\030\0010\003\022\n\b\002\020\t\032\004\030\0010\005¢\006\004\b\n\020\013J\020\020\026\032\004\030\0010\003HÆ\003¢\006\002\020\rJ\020\020\027\032\004\030\0010\005HÆ\003¢\006\002\020\020J\013\020\030\032\004\030\0010\007HÆ\003J\020\020\031\032\004\030\0010\003HÆ\003¢\006\002\020\rJ\020\020\032\032\004\030\0010\005HÆ\003¢\006\002\020\020JJ\020\033\032\0020\0002\n\b\002\020\002\032\004\030\0010\0032\n\b\002\020\004\032\004\030\0010\0052\n\b\002\020\006\032\004\030\0010\0072\n\b\002\020\b\032\004\030\0010\0032\n\b\002\020\t\032\004\030\0010\005HÆ\001¢\006\002\020\034J\023\020\035\032\0020\0362\b\020\037\032\004\030\0010\001HÖ\003J\t\020 \032\0020!HÖ\001J\t\020\"\032\0020\007HÖ\001R\025\020\002\032\004\030\0010\003¢\006\n\n\002\020\016\032\004\b\f\020\rR\025\020\004\032\004\030\0010\005¢\006\n\n\002\020\021\032\004\b\017\020\020R\023\020\006\032\004\030\0010\007¢\006\b\n\000\032\004\b\022\020\023R\025\020\b\032\004\030\0010\003¢\006\n\n\002\020\016\032\004\b\024\020\rR\025\020\t\032\004\030\0010\005¢\006\n\n\002\020\021\032\004\b\025\020\020¨\006#"}, d2 = {"Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelModelParameters;", "", "temperature", "", "length", "", "stop", "", "topP", "topK", "<init>", "(Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Long;)V", "getTemperature", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getLength", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getStop", "()Ljava/lang/String;", "getTopP", "getTopK", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Long;)Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelModelParameters;", "equals", "", "other", "hashCode", "", "toString", "tasks-provider-llm-prompt-velocity-model"})
/*   */ public final class VelocityModelModelParameters { @Nullable
/*   */   private final Double temperature; @Nullable
/* 4 */   private final Long length; public VelocityModelModelParameters(@Nullable Double temperature, @Nullable Long length, @Nullable String stop, @Nullable Double topP, @Nullable Long topK) { this.temperature = temperature;
/* 5 */     this.length = length;
/* 6 */     this.stop = stop;
/* 7 */     this.topP = topP;
/* 8 */     this.topK = topK; } @Nullable private final String stop; @Nullable private final Double topP; @Nullable private final Long topK; @Nullable public final Double getTemperature() { return this.temperature; } @Nullable public final Long getLength() { return this.length; } @Nullable public final Long getTopK() { return this.topK; }
/*   */ 
/*   */   
/*   */   @Nullable
/*   */   public final String getStop() {
/*   */     return this.stop;
/*   */   }
/*   */   
/*   */   @Nullable
/*   */   public final Double getTopP() {
/*   */     return this.topP;
/*   */   }
/*   */   
/*   */   @Nullable
/*   */   public final Double component1() {
/*   */     return this.temperature;
/*   */   }
/*   */   
/*   */   @Nullable
/*   */   public final Long component2() {
/*   */     return this.length;
/*   */   }
/*   */   
/*   */   @Nullable
/*   */   public final String component3() {
/*   */     return this.stop;
/*   */   }
/*   */   
/*   */   @Nullable
/*   */   public final Double component4() {
/*   */     return this.topP;
/*   */   }
/*   */   
/*   */   @Nullable
/*   */   public final Long component5() {
/*   */     return this.topK;
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public final VelocityModelModelParameters copy(@Nullable Double temperature, @Nullable Long length, @Nullable String stop, @Nullable Double topP, @Nullable Long topK) {
/*   */     return new VelocityModelModelParameters(temperature, length, stop, topP, topK);
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public String toString() {
/*   */     return "VelocityModelModelParameters(temperature=" + this.temperature + ", length=" + this.length + ", stop=" + this.stop + ", topP=" + this.topP + ", topK=" + this.topK + ")";
/*   */   }
/*   */   
/*   */   public int hashCode() {
/*   */     result = (this.temperature == null) ? 0 : this.temperature.hashCode();
/*   */     result = result * 31 + ((this.length == null) ? 0 : this.length.hashCode());
/*   */     result = result * 31 + ((this.stop == null) ? 0 : this.stop.hashCode());
/*   */     result = result * 31 + ((this.topP == null) ? 0 : this.topP.hashCode());
/*   */     return result * 31 + ((this.topK == null) ? 0 : this.topK.hashCode());
/*   */   }
/*   */   
/*   */   public boolean equals(@Nullable Object other) {
/*   */     if (this == other)
/*   */       return true; 
/*   */     if (!(other instanceof VelocityModelModelParameters))
/*   */       return false; 
/*   */     VelocityModelModelParameters velocityModelModelParameters = (VelocityModelModelParameters)other;
/*   */     return !Intrinsics.areEqual(this.temperature, velocityModelModelParameters.temperature) ? false : (!Intrinsics.areEqual(this.length, velocityModelModelParameters.length) ? false : (!Intrinsics.areEqual(this.stop, velocityModelModelParameters.stop) ? false : (!Intrinsics.areEqual(this.topP, velocityModelModelParameters.topP) ? false : (!!Intrinsics.areEqual(this.topK, velocityModelModelParameters.topK)))));
/*   */   }
/*   */   
/*   */   public VelocityModelModelParameters() {
/*   */     this(null, null, null, null, null, 31, null);
/*   */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-provider-llm-prompt-velocity-model-0.4.32.jar!\ai\grazie\tasks\provider\prompt\velocity\resources\model\VelocityModelModelParameters.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */