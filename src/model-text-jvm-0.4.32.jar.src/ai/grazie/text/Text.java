/*    */ package ai.grazie.text;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\030\002\n\002\020\r\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\b\n\002\b\007\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\f\n\002\b\007\n\002\030\002\n\002\b\002\b\b\030\0002\0020\0012\0020\002B\r\022\006\020\003\032\0020\004¢\006\002\020\005J\t\020\020\032\0020\004HÆ\003J\023\020\021\032\0020\0002\b\b\002\020\003\032\0020\004HÆ\001J\023\020\022\032\0020\0232\b\020\024\032\004\030\0010\025HÖ\003J\021\020\026\032\0020\0272\006\020\030\032\0020\013H\002J\t\020\031\032\0020\013HÖ\001J\030\020\032\032\0020\0022\006\020\033\032\0020\0132\006\020\034\032\0020\013H\026J\016\020\035\032\0020\0002\006\020\036\032\0020\037J\b\020 \032\0020\004H\026R\021\020\006\032\0020\0078F¢\006\006\032\004\b\b\020\tR\024\020\n\032\0020\013X\004¢\006\b\n\000\032\004\b\f\020\rR\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\016\020\017¨\006!"}, d2 = {"Lai/grazie/text/Text;", "Lai/grazie/DataHolder;", "", "value", "", "(Ljava/lang/String;)V", "hash", "Lai/grazie/utils/Hash;", "getHash", "()Lai/grazie/utils/Hash;", "length", "", "getLength", "()I", "getValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "get", "", "index", "hashCode", "subSequence", "startIndex", "endIndex", "substring", "range", "Lai/grazie/text/TextRange;", "toString", "model-text"})
/*    */ public final class Text extends DataHolder implements CharSequence {
/*    */   @NotNull
/*    */   private final String value;
/*    */   private final int length;
/*    */   
/*  9 */   public Text(@NotNull String value) { this.value = value;
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 14 */     this.length = this.value.length(); } @NotNull public final String getValue() { return this.value; } @NotNull public final Hash getHash() { return (Hash)getOrPut(HashKey.INSTANCE, new Text$hash$1()); } public int getLength() { return this.length; }
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "Lai/grazie/utils/Hash;", "invoke"}) static final class Text$hash$1 extends Lambda implements Function0<Hash> {
/* 16 */     Text$hash$1() { super(0); } public final Hash invoke() { return HashKt.hash(Text.this.getValue()); } } @NotNull public String toString() { return this.value; }
/*    */   @NotNull
/*    */   public final Text substring(@NotNull TextRange range) { Intrinsics.checkNotNullParameter(range, "range");
/* 19 */     return new Text(ExtensionsKt.substring(this.value, range)); } public char get(int index) { return this.value.charAt(index); }
/*    */    @NotNull
/*    */   public CharSequence subSequence(int startIndex, int endIndex) {
/* 22 */     return this.value.subSequence(startIndex, endIndex);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.value;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Text copy(@NotNull String value) {
/*    */     Intrinsics.checkNotNullParameter(value, "value");
/*    */     return new Text(value);
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     return this.value.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof Text))
/*    */       return false; 
/*    */     Text text = (Text)other;
/*    */     return !!Intrinsics.areEqual(this.value, text.value);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-text-jvm-0.4.32.jar!\ai\grazie\text\Text.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */