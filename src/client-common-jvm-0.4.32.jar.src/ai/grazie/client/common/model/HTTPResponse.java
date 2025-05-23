/*    */ package ai.grazie.client.common.model;
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020\b\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\020\022\n\002\b\021\n\002\020\013\n\002\b\004\b\b\030\0002\0020\001B\037\b\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007¢\006\002\020\bB\031\b\027\022\006\020\002\032\0020\t\022\b\020\n\032\004\030\0010\013¢\006\002\020\fB\027\b\027\022\006\020\002\032\0020\t\022\006\020\006\032\0020\007¢\006\002\020\rB\031\b\027\022\006\020\002\032\0020\003\022\b\020\n\032\004\030\0010\013¢\006\002\020\016B\037\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\b\020\n\032\004\030\0010\013¢\006\002\020\017J\t\020\030\032\0020\003HÆ\003J\t\020\031\032\0020\005HÆ\003J\013\020\032\032\004\030\0010\013HÆ\003J)\020\033\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\n\b\002\020\n\032\004\030\0010\013HÆ\001J\023\020\034\032\0020\0352\b\020\036\032\004\030\0010\001H\002J\b\020\037\032\0020\005H\026J\t\020 \032\0020\007HÖ\001R\023\020\n\032\004\030\0010\013¢\006\b\n\000\032\004\b\020\020\021R\023\020\006\032\004\030\0010\0078F¢\006\006\032\004\b\022\020\023R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\024\020\025R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\026\020\027¨\006!"}, d2 = {"Lai/grazie/client/common/model/HTTPResponse;", "", "headers", "Lai/grazie/model/cloud/HeaderCollection;", "statusCode", "", "content", "", "(Lai/grazie/model/cloud/HeaderCollection;ILjava/lang/String;)V", "Lai/grazie/client/common/model/HeaderCollection;", "bytes", "", "(Lai/grazie/client/common/model/HeaderCollection;[B)V", "(Lai/grazie/client/common/model/HeaderCollection;Ljava/lang/String;)V", "(Lai/grazie/model/cloud/HeaderCollection;[B)V", "(Lai/grazie/model/cloud/HeaderCollection;I[B)V", "getBytes", "()[B", "getContent", "()Ljava/lang/String;", "getHeaders", "()Lai/grazie/model/cloud/HeaderCollection;", "getStatusCode", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "client-common"})
/*    */ public final class HTTPResponse {
/*    */   @NotNull
/*    */   private final HeaderCollection headers;
/*    */   
/*  9 */   public HTTPResponse(@NotNull HeaderCollection headers, int statusCode, @Nullable byte[] bytes) { this.headers = headers; this.statusCode = statusCode; this.bytes = bytes; } private final int statusCode; @Nullable private final byte[] bytes; @NotNull public final HeaderCollection getHeaders() { return this.headers; } public final int getStatusCode() { return this.statusCode; } @Nullable public final byte[] getBytes() { return this.bytes; }
/*    */   
/*    */   public HTTPResponse(@NotNull HeaderCollection headers, int statusCode, @NotNull String content) {
/* 12 */     this(headers, statusCode, StringsKt.encodeToByteArray(content));
/*    */   }
/*    */   @Deprecated(message = "In favor of overload with new HeaderCollection")
/*    */   public HTTPResponse(@NotNull HeaderCollection headers, @Nullable byte[] bytes) {
/* 16 */     this(headers.toHeaderCollection(), 200, bytes);
/*    */   }
/*    */   @Deprecated(message = "In favor of overload with new HeaderCollection")
/*    */   public HTTPResponse(@NotNull HeaderCollection headers, @NotNull String content) {
/* 20 */     this(headers, StringsKt.encodeToByteArray(content));
/*    */   }
/*    */   @Deprecated(message = "For backward compatibility, should be removed")
/*    */   public HTTPResponse(@NotNull HeaderCollection headers, @Nullable byte[] bytes) {
/* 24 */     this(headers, 200, bytes);
/*    */   } @Nullable
/*    */   public final String getContent() {
/* 27 */     return (this.bytes != null) ? StringsKt.decodeToString(this.bytes) : null;
/*    */   }
/*    */   public boolean equals(@Nullable Object other) {
/* 30 */     if (this == other) return true; 
/* 31 */     if (other == null || getClass() != other.getClass()) return false;
/*    */     
/* 33 */     (HTTPResponse)other;
/*    */     
/* 35 */     if (!Intrinsics.areEqual(this.headers, ((HTTPResponse)other).headers)) return false; 
/* 36 */     if (this.bytes != null)
/* 37 */     { if (((HTTPResponse)other).bytes == null) return false; 
/* 38 */       if (!Arrays.equals(this.bytes, ((HTTPResponse)other).bytes)) return false;  }
/* 39 */     else if (((HTTPResponse)other).bytes != null) { return false; }
/*    */     
/* 41 */     return true;
/*    */   }
/*    */   
/*    */   public int hashCode() {
/* 45 */     int result = this.headers.hashCode();
/* 46 */     result = 31 * result + ((this.bytes != null) ? Arrays.hashCode(this.bytes) : 0);
/* 47 */     return result;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final HeaderCollection component1() {
/*    */     return this.headers;
/*    */   }
/*    */   
/*    */   public final int component2() {
/*    */     return this.statusCode;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final byte[] component3() {
/*    */     return this.bytes;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final HTTPResponse copy(@NotNull HeaderCollection headers, int statusCode, @Nullable byte[] bytes) {
/*    */     Intrinsics.checkNotNullParameter(headers, "headers");
/*    */     return new HTTPResponse(headers, statusCode, bytes);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "HTTPResponse(headers=" + this.headers + ", statusCode=" + this.statusCode + ", bytes=" + Arrays.toString(this.bytes) + ")";
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\client-common-jvm-0.4.32.jar!\ai\grazie\client\common\model\HTTPResponse.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */