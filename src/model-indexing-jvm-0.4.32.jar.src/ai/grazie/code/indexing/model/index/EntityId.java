/*   */ package ai.grazie.code.indexing.model.index;
/*   */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\f\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\037\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\b\b\002\020\006\032\0020\007¢\006\002\020\bJ\t\020\017\032\0020\003HÆ\003J\t\020\020\032\0020\005HÆ\003J\t\020\021\032\0020\007HÆ\003J'\020\022\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\007HÆ\001J\023\020\023\032\0020\0242\b\020\025\032\004\030\0010\001HÖ\003J\t\020\026\032\0020\027HÖ\001J\t\020\030\032\0020\003HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\t\020\nR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\013\020\fR\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\r\020\016¨\006\031"}, d2 = {"Lai/grazie/code/indexing/model/index/EntityId;", "", "id", "", "sourcePosition", "Lai/grazie/code/indexing/model/SourcePosition;", "sourceType", "Lai/grazie/code/indexing/model/index/EntitySourceType;", "(Ljava/lang/String;Lai/grazie/code/indexing/model/SourcePosition;Lai/grazie/code/indexing/model/index/EntitySourceType;)V", "getId", "()Ljava/lang/String;", "getSourcePosition", "()Lai/grazie/code/indexing/model/SourcePosition;", "getSourceType", "()Lai/grazie/code/indexing/model/index/EntitySourceType;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "model-indexing"})
/*   */ public final class EntityId { @NotNull
/*   */   private final String id;
/*   */   
/* 6 */   public EntityId(@NotNull String id, @NotNull SourcePosition sourcePosition, @NotNull EntitySourceType sourceType) { this.id = id;
/* 7 */     this.sourcePosition = sourcePosition;
/* 8 */     this.sourceType = sourceType; } @NotNull private final SourcePosition sourcePosition; @NotNull private final EntitySourceType sourceType; @NotNull public final String getId() { return this.id; } @NotNull public final EntitySourceType getSourceType() { return this.sourceType; }
/*   */ 
/*   */   
/*   */   @NotNull
/*   */   public final SourcePosition getSourcePosition() {
/*   */     return this.sourcePosition;
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public final String component1() {
/*   */     return this.id;
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public final SourcePosition component2() {
/*   */     return this.sourcePosition;
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public final EntitySourceType component3() {
/*   */     return this.sourceType;
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public final EntityId copy(@NotNull String id, @NotNull SourcePosition sourcePosition, @NotNull EntitySourceType sourceType) {
/*   */     Intrinsics.checkNotNullParameter(id, "id");
/*   */     Intrinsics.checkNotNullParameter(sourcePosition, "sourcePosition");
/*   */     Intrinsics.checkNotNullParameter(sourceType, "sourceType");
/*   */     return new EntityId(id, sourcePosition, sourceType);
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public String toString() {
/*   */     return "EntityId(id=" + this.id + ", sourcePosition=" + this.sourcePosition + ", sourceType=" + this.sourceType + ")";
/*   */   }
/*   */   
/*   */   public int hashCode() {
/*   */     result = this.id.hashCode();
/*   */     result = result * 31 + this.sourcePosition.hashCode();
/*   */     return result * 31 + this.sourceType.hashCode();
/*   */   }
/*   */   
/*   */   public boolean equals(@Nullable Object other) {
/*   */     if (this == other)
/*   */       return true; 
/*   */     if (!(other instanceof EntityId))
/*   */       return false; 
/*   */     EntityId entityId = (EntityId)other;
/*   */     return !Intrinsics.areEqual(this.id, entityId.id) ? false : (!Intrinsics.areEqual(this.sourcePosition, entityId.sourcePosition) ? false : (!(this.sourceType != entityId.sourceType)));
/*   */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-indexing-jvm-0.4.32.jar!\ai\grazie\code\indexing\model\index\EntityId.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */