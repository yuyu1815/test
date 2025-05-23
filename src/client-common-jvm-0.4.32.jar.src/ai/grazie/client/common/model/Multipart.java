/*    */ package ai.grazie.client.common.model;
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\000\n\002\020\021\n\002\030\002\n\002\b\006\n\002\020\002\n\002\b\005\b\007\030\0002\0020\001:\003\r\016\017B\025\022\016\b\002\020\002\032\b\022\004\022\0020\0040\003¢\006\002\020\005J\016\020\n\032\0020\0132\006\020\f\032\0020\004R\"\020\002\032\b\022\004\022\0020\0040\003X\016¢\006\020\n\002\020\t\032\004\b\006\020\007\"\004\b\b\020\005¨\006\020"}, d2 = {"Lai/grazie/client/common/model/Multipart;", "", "parts", "", "Lai/grazie/client/common/model/Multipart$PartItem;", "([Lai/grazie/client/common/model/Multipart$PartItem;)V", "getParts", "()[Lai/grazie/client/common/model/Multipart$PartItem;", "setParts", "[Lai/grazie/client/common/model/Multipart$PartItem;", "append", "", "part", "FilePart", "FormPart", "PartItem", "client-common"})
/*    */ public final class Multipart {
/*    */   @NotNull
/*    */   private PartItem[] parts;
/*    */   
/*  7 */   public Multipart(@NotNull PartItem[] parts) { this.parts = parts; } @NotNull public final PartItem[] getParts() { return this.parts; } public final void setParts(@NotNull PartItem[] <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.parts = <set-?>; }
/*    */   
/*  9 */   public final void append(@NotNull PartItem part) { Intrinsics.checkNotNullParameter(part, "part"); this.parts = (PartItem[])ArraysKt.plus((Object[])this.parts, part); } public Multipart() { this(null, 1, null); } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\005\bf\030\0002\0020\001R\022\020\002\032\0020\003X¦\004¢\006\006\032\004\b\004\020\005R\022\020\006\032\0020\007X¦\004¢\006\006\032\004\b\b\020\tR\022\020\n\032\0020\007X¦\004¢\006\006\032\004\b\013\020\tø\001\000\002\006\n\004\b!0\001¨\006\fÀ\006\001"}, d2 = {"Lai/grazie/client/common/model/Multipart$PartItem;", "", "headers", "Lai/grazie/model/cloud/HeaderCollection;", "getHeaders", "()Lai/grazie/model/cloud/HeaderCollection;", "key", "", "getKey", "()Ljava/lang/String;", "value", "getValue", "client-common"})
/*    */   public static interface PartItem {
/*    */     @NotNull
/*    */     String getKey(); @NotNull
/*    */     String getValue(); @NotNull
/*    */     HeaderCollection getHeaders(); } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\013\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\037\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\b\b\002\020\005\032\0020\006¢\006\002\020\007J\t\020\r\032\0020\003HÆ\003J\t\020\016\032\0020\003HÆ\003J\t\020\017\032\0020\006HÆ\003J'\020\020\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0032\b\b\002\020\005\032\0020\006HÆ\001J\023\020\021\032\0020\0222\b\020\023\032\004\030\0010\024HÖ\003J\t\020\025\032\0020\026HÖ\001J\t\020\027\032\0020\003HÖ\001R\024\020\005\032\0020\006X\004¢\006\b\n\000\032\004\b\b\020\tR\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\n\020\013R\024\020\004\032\0020\003X\004¢\006\b\n\000\032\004\b\f\020\013¨\006\030"}, d2 = {"Lai/grazie/client/common/model/Multipart$FormPart;", "Lai/grazie/client/common/model/Multipart$PartItem;", "key", "", "value", "headers", "Lai/grazie/model/cloud/HeaderCollection;", "(Ljava/lang/String;Ljava/lang/String;Lai/grazie/model/cloud/HeaderCollection;)V", "getHeaders", "()Lai/grazie/model/cloud/HeaderCollection;", "getKey", "()Ljava/lang/String;", "getValue", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "client-common"})
/*    */   public static final class FormPart implements PartItem { @NotNull
/*    */     private final String key; @NotNull
/*    */     private final String value; @NotNull
/*    */     private final HeaderCollection headers;
/* 19 */     public FormPart(@NotNull String key, @NotNull String value, @NotNull HeaderCollection headers) { this.key = key;
/* 20 */       this.value = value;
/* 21 */       this.headers = headers; } @NotNull public String getKey() { return this.key; } @NotNull public String getValue() { return this.value; } @NotNull public final String component1() { return this.key; } @NotNull public final String component2() { return this.value; } @NotNull public final HeaderCollection component3() { return this.headers; } @NotNull public final FormPart copy(@NotNull String key, @NotNull String value, @NotNull HeaderCollection headers) { Intrinsics.checkNotNullParameter(key, "key"); Intrinsics.checkNotNullParameter(value, "value"); Intrinsics.checkNotNullParameter(headers, "headers"); return new FormPart(key, value, headers); } @NotNull public HeaderCollection getHeaders() { return this.headers; } @NotNull public String toString() { return "FormPart(key=" + this.key + ", value=" + this.value + ", headers=" + this.headers + ")"; } public int hashCode() { result = this.key.hashCode(); result = result * 31 + this.value.hashCode(); return result * 31 + this.headers.hashCode(); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof FormPart))
/*    */         return false;  FormPart formPart = (FormPart)other; return !Intrinsics.areEqual(this.key, formPart.key) ? false : (!Intrinsics.areEqual(this.value, formPart.value) ? false : (!!Intrinsics.areEqual(this.headers, formPart.headers))); } }
/*    */    @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\r\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B'\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\003\022\b\b\002\020\006\032\0020\007¢\006\002\020\bJ\t\020\017\032\0020\003HÆ\003J\t\020\020\032\0020\003HÆ\003J\t\020\021\032\0020\003HÆ\003J\t\020\022\032\0020\007HÆ\003J1\020\023\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0032\b\b\002\020\005\032\0020\0032\b\b\002\020\006\032\0020\007HÆ\001J\023\020\024\032\0020\0252\b\020\026\032\004\030\0010\027HÖ\003J\t\020\030\032\0020\031HÖ\001J\t\020\032\032\0020\003HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\t\020\nR\024\020\006\032\0020\007X\004¢\006\b\n\000\032\004\b\013\020\fR\024\020\004\032\0020\003X\004¢\006\b\n\000\032\004\b\r\020\nR\024\020\005\032\0020\003X\004¢\006\b\n\000\032\004\b\016\020\n¨\006\033"}, d2 = {"Lai/grazie/client/common/model/Multipart$FilePart;", "Lai/grazie/client/common/model/Multipart$PartItem;", "fileName", "", "key", "value", "headers", "Lai/grazie/model/cloud/HeaderCollection;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lai/grazie/model/cloud/HeaderCollection;)V", "getFileName", "()Ljava/lang/String;", "getHeaders", "()Lai/grazie/model/cloud/HeaderCollection;", "getKey", "getValue", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "client-common"}) public static final class FilePart implements PartItem
/*    */   {
/* 25 */     @NotNull private final String fileName; @NotNull private final String key; @NotNull private final String value; @NotNull private final HeaderCollection headers; public FilePart(@NotNull String fileName, @NotNull String key, @NotNull String value, @NotNull HeaderCollection headers) { this.fileName = fileName;
/* 26 */       this.key = key;
/* 27 */       this.value = value;
/* 28 */       this.headers = headers; } @NotNull public final String getFileName() { return this.fileName; } @NotNull public String getKey() { return this.key; } @NotNull public String getValue() { return this.value; } @NotNull public HeaderCollection getHeaders() { return this.headers; }
/*    */ 
/*    */     
/*    */     @NotNull
/*    */     public final String component1() {
/*    */       return this.fileName;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final String component2() {
/*    */       return this.key;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final String component3() {
/*    */       return this.value;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final HeaderCollection component4() {
/*    */       return this.headers;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final FilePart copy(@NotNull String fileName, @NotNull String key, @NotNull String value, @NotNull HeaderCollection headers) {
/*    */       Intrinsics.checkNotNullParameter(fileName, "fileName");
/*    */       Intrinsics.checkNotNullParameter(key, "key");
/*    */       Intrinsics.checkNotNullParameter(value, "value");
/*    */       Intrinsics.checkNotNullParameter(headers, "headers");
/*    */       return new FilePart(fileName, key, value, headers);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public String toString() {
/*    */       return "FilePart(fileName=" + this.fileName + ", key=" + this.key + ", value=" + this.value + ", headers=" + this.headers + ")";
/*    */     }
/*    */     
/*    */     public int hashCode() {
/*    */       result = this.fileName.hashCode();
/*    */       result = result * 31 + this.key.hashCode();
/*    */       result = result * 31 + this.value.hashCode();
/*    */       return result * 31 + this.headers.hashCode();
/*    */     }
/*    */     
/*    */     public boolean equals(@Nullable Object other) {
/*    */       if (this == other)
/*    */         return true; 
/*    */       if (!(other instanceof FilePart))
/*    */         return false; 
/*    */       FilePart filePart = (FilePart)other;
/*    */       return !Intrinsics.areEqual(this.fileName, filePart.fileName) ? false : (!Intrinsics.areEqual(this.key, filePart.key) ? false : (!Intrinsics.areEqual(this.value, filePart.value) ? false : (!!Intrinsics.areEqual(this.headers, filePart.headers))));
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\client-common-jvm-0.4.32.jar!\ai\grazie\client\common\model\Multipart.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */