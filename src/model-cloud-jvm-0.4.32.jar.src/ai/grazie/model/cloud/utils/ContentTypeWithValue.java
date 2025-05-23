/*   */ package ai.grazie.model.cloud.utils;
/*   */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\000\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\013\n\002\020\013\n\002\b\002\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\000*\004\b\000\020\0012\0020\002B\025\022\006\020\003\032\0028\000\022\006\020\004\032\0020\005¢\006\002\020\006J\016\020\f\032\0028\000HÆ\003¢\006\002\020\nJ\t\020\r\032\0020\005HÆ\003J(\020\016\032\b\022\004\022\0028\0000\0002\b\b\002\020\003\032\0028\0002\b\b\002\020\004\032\0020\005HÆ\001¢\006\002\020\017J\023\020\020\032\0020\0212\b\020\022\032\004\030\0010\002HÖ\003J\t\020\023\032\0020\024HÖ\001J\t\020\025\032\0020\026HÖ\001R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\007\020\bR\023\020\003\032\0028\000¢\006\n\n\002\020\013\032\004\b\t\020\n¨\006\027"}, d2 = {"Lai/grazie/model/cloud/utils/ContentTypeWithValue;", "T", "", "value", "contentType", "Lai/grazie/model/cloud/ContentType;", "(Ljava/lang/Object;Lai/grazie/model/cloud/ContentType;)V", "getContentType", "()Lai/grazie/model/cloud/ContentType;", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "component2", "copy", "(Ljava/lang/Object;Lai/grazie/model/cloud/ContentType;)Lai/grazie/model/cloud/utils/ContentTypeWithValue;", "equals", "", "other", "hashCode", "", "toString", "", "model-cloud"})
/*   */ public final class ContentTypeWithValue<T> { private final T value;
/*   */   
/* 5 */   public ContentTypeWithValue(Object value, @NotNull ContentType contentType) { this.value = (T)value; this.contentType = contentType; } @NotNull private final ContentType contentType; public final T getValue() { return this.value; } @NotNull public final ContentType getContentType() { return this.contentType; }
/*   */ 
/*   */   
/*   */   public final T component1() {
/*   */     return this.value;
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public final ContentType component2() {
/*   */     return this.contentType;
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public final ContentTypeWithValue<T> copy(Object value, @NotNull ContentType contentType) {
/*   */     Intrinsics.checkNotNullParameter(contentType, "contentType");
/*   */     return new ContentTypeWithValue((T)value, contentType);
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public String toString() {
/*   */     return "ContentTypeWithValue(value=" + this.value + ", contentType=" + this.contentType + ")";
/*   */   }
/*   */   
/*   */   public int hashCode() {
/*   */     result = (this.value == null) ? 0 : this.value.hashCode();
/*   */     return result * 31 + this.contentType.hashCode();
/*   */   }
/*   */   
/*   */   public boolean equals(@Nullable Object other) {
/*   */     if (this == other)
/*   */       return true; 
/*   */     if (!(other instanceof ContentTypeWithValue))
/*   */       return false; 
/*   */     ContentTypeWithValue contentTypeWithValue = (ContentTypeWithValue)other;
/*   */     return !Intrinsics.areEqual(this.value, contentTypeWithValue.value) ? false : (!!Intrinsics.areEqual(this.contentType, contentTypeWithValue.contentType));
/*   */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-cloud-jvm-0.4.32.jar!\ai\grazie\model\clou\\utils\ContentTypeWithValue.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */