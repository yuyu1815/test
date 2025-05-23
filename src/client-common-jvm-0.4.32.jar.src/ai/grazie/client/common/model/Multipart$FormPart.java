/*    */ package ai.grazie.client.common.model;
/*    */ 
/*    */ import ai.grazie.model.cloud.HeaderCollection;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\013\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\037\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\b\b\002\020\005\032\0020\006¢\006\002\020\007J\t\020\r\032\0020\003HÆ\003J\t\020\016\032\0020\003HÆ\003J\t\020\017\032\0020\006HÆ\003J'\020\020\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0032\b\b\002\020\005\032\0020\006HÆ\001J\023\020\021\032\0020\0222\b\020\023\032\004\030\0010\024HÖ\003J\t\020\025\032\0020\026HÖ\001J\t\020\027\032\0020\003HÖ\001R\024\020\005\032\0020\006X\004¢\006\b\n\000\032\004\b\b\020\tR\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\n\020\013R\024\020\004\032\0020\003X\004¢\006\b\n\000\032\004\b\f\020\013¨\006\030"}, d2 = {"Lai/grazie/client/common/model/Multipart$FormPart;", "Lai/grazie/client/common/model/Multipart$PartItem;", "key", "", "value", "headers", "Lai/grazie/model/cloud/HeaderCollection;", "(Ljava/lang/String;Ljava/lang/String;Lai/grazie/model/cloud/HeaderCollection;)V", "getHeaders", "()Lai/grazie/model/cloud/HeaderCollection;", "getKey", "()Ljava/lang/String;", "getValue", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "client-common"})
/*    */ public final class FormPart implements Multipart.PartItem {
/*    */   @NotNull
/*    */   private final String key;
/*    */   @NotNull
/*    */   private final String value;
/*    */   @NotNull
/*    */   private final HeaderCollection headers;
/*    */   
/* 19 */   public FormPart(@NotNull String key, @NotNull String value, @NotNull HeaderCollection headers) { this.key = key;
/* 20 */     this.value = value;
/* 21 */     this.headers = headers; } @NotNull public HeaderCollection getHeaders() { return this.headers; }
/*    */ 
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
/*    */     return this.key;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component2() {
/*    */     return this.value;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final HeaderCollection component3() {
/*    */     return this.headers;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final FormPart copy(@NotNull String key, @NotNull String value, @NotNull HeaderCollection headers) {
/*    */     Intrinsics.checkNotNullParameter(key, "key");
/*    */     Intrinsics.checkNotNullParameter(value, "value");
/*    */     Intrinsics.checkNotNullParameter(headers, "headers");
/*    */     return new FormPart(key, value, headers);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "FormPart(key=" + this.key + ", value=" + this.value + ", headers=" + this.headers + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.key.hashCode();
/*    */     result = result * 31 + this.value.hashCode();
/*    */     return result * 31 + this.headers.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof FormPart))
/*    */       return false; 
/*    */     FormPart formPart = (FormPart)other;
/*    */     return !Intrinsics.areEqual(this.key, formPart.key) ? false : (!Intrinsics.areEqual(this.value, formPart.value) ? false : (!!Intrinsics.areEqual(this.headers, formPart.headers)));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\client-common-jvm-0.4.32.jar!\ai\grazie\client\common\model\Multipart$FormPart.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */