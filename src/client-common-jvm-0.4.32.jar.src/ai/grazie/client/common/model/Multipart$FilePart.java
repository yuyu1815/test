/*    */ package ai.grazie.client.common.model;
/*    */ 
/*    */ import ai.grazie.model.cloud.HeaderCollection;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\r\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B'\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\003\022\b\b\002\020\006\032\0020\007¢\006\002\020\bJ\t\020\017\032\0020\003HÆ\003J\t\020\020\032\0020\003HÆ\003J\t\020\021\032\0020\003HÆ\003J\t\020\022\032\0020\007HÆ\003J1\020\023\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0032\b\b\002\020\005\032\0020\0032\b\b\002\020\006\032\0020\007HÆ\001J\023\020\024\032\0020\0252\b\020\026\032\004\030\0010\027HÖ\003J\t\020\030\032\0020\031HÖ\001J\t\020\032\032\0020\003HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\t\020\nR\024\020\006\032\0020\007X\004¢\006\b\n\000\032\004\b\013\020\fR\024\020\004\032\0020\003X\004¢\006\b\n\000\032\004\b\r\020\nR\024\020\005\032\0020\003X\004¢\006\b\n\000\032\004\b\016\020\n¨\006\033"}, d2 = {"Lai/grazie/client/common/model/Multipart$FilePart;", "Lai/grazie/client/common/model/Multipart$PartItem;", "fileName", "", "key", "value", "headers", "Lai/grazie/model/cloud/HeaderCollection;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lai/grazie/model/cloud/HeaderCollection;)V", "getFileName", "()Ljava/lang/String;", "getHeaders", "()Lai/grazie/model/cloud/HeaderCollection;", "getKey", "getValue", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "client-common"})
/*    */ public final class FilePart
/*    */   implements Multipart.PartItem
/*    */ {
/*    */   @NotNull
/*    */   private final String fileName;
/*    */   @NotNull
/*    */   private final String key;
/*    */   @NotNull
/*    */   private final String value;
/*    */   @NotNull
/*    */   private final HeaderCollection headers;
/*    */   
/*    */   public FilePart(@NotNull String fileName, @NotNull String key, @NotNull String value, @NotNull HeaderCollection headers) {
/* 25 */     this.fileName = fileName;
/* 26 */     this.key = key;
/* 27 */     this.value = value;
/* 28 */     this.headers = headers; } @NotNull public HeaderCollection getHeaders() { return this.headers; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final String getFileName() {
/*    */     return this.fileName;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String getKey() {
/*    */     return this.key;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String getValue() {
/*    */     return this.value;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.fileName;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component2() {
/*    */     return this.key;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component3() {
/*    */     return this.value;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final HeaderCollection component4() {
/*    */     return this.headers;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final FilePart copy(@NotNull String fileName, @NotNull String key, @NotNull String value, @NotNull HeaderCollection headers) {
/*    */     Intrinsics.checkNotNullParameter(fileName, "fileName");
/*    */     Intrinsics.checkNotNullParameter(key, "key");
/*    */     Intrinsics.checkNotNullParameter(value, "value");
/*    */     Intrinsics.checkNotNullParameter(headers, "headers");
/*    */     return new FilePart(fileName, key, value, headers);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "FilePart(fileName=" + this.fileName + ", key=" + this.key + ", value=" + this.value + ", headers=" + this.headers + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.fileName.hashCode();
/*    */     result = result * 31 + this.key.hashCode();
/*    */     result = result * 31 + this.value.hashCode();
/*    */     return result * 31 + this.headers.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof FilePart))
/*    */       return false; 
/*    */     FilePart filePart = (FilePart)other;
/*    */     return !Intrinsics.areEqual(this.fileName, filePart.fileName) ? false : (!Intrinsics.areEqual(this.key, filePart.key) ? false : (!Intrinsics.areEqual(this.value, filePart.value) ? false : (!!Intrinsics.areEqual(this.headers, filePart.headers))));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\client-common-jvm-0.4.32.jar!\ai\grazie\client\common\model\Multipart$FilePart.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */