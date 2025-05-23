/*     */ package org.jetbrains.jewel.foundation.code;
/*     */ 
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000\024\n\000\n\002\020\013\n\002\030\002\n\002\b\023\n\002\020\016\n\000\032\023\020\000\032\0020\001*\004\030\0010\002¢\006\004\b\003\020\004\032\023\020\005\032\0020\001*\004\030\0010\002¢\006\004\b\006\020\004\032\023\020\007\032\0020\001*\004\030\0010\002¢\006\004\b\b\020\004\032\023\020\t\032\0020\001*\004\030\0010\002¢\006\004\b\n\020\004\032\023\020\013\032\0020\001*\004\030\0010\002¢\006\004\b\f\020\004\032\023\020\r\032\0020\001*\004\030\0010\002¢\006\004\b\016\020\004\032\023\020\017\032\0020\001*\004\030\0010\002¢\006\004\b\020\020\004\032\023\020\021\032\0020\001*\004\030\0010\002¢\006\004\b\022\020\004\032\023\020\023\032\0020\001*\004\030\0010\002¢\006\004\b\024\020\004\032\f\020\025\032\0020\026*\0020\026H\002¨\006\027"}, d2 = {"isKotlin", "", "Lorg/jetbrains/jewel/foundation/code/MimeType;", "isKotlin-KcqRzx0", "(Ljava/lang/String;)Z", "isJava", "isJava-KcqRzx0", "isXml", "isXml-KcqRzx0", "isGradle", "isGradle-KcqRzx0", "isVersionCatalog", "isVersionCatalog-KcqRzx0", "isManifest", "isManifest-KcqRzx0", "isSql", "isSql-KcqRzx0", "isRegex", "isRegex-KcqRzx0", "isProto", "isProto-KcqRzx0", "capitalizeAsciiOnly", "", "foundation"})
/*     */ public final class MimeTypeKt
/*     */ {
/*     */   public static final boolean isKotlin-KcqRzx0(@Nullable String $this$isKotlin_u2dKcqRzx0) {
/* 352 */     String str1 = ($this$isKotlin_u2dKcqRzx0 != null) ? MimeType.base-9EQw4cI($this$isKotlin_u2dKcqRzx0) : null, str2 = MimeType.Known.INSTANCE.getKOTLIN-9EQw4cI(); return (str1 == null) ? false : MimeType.equals-impl0(str1, str2);
/*     */   }
/*     */   public static final boolean isJava-KcqRzx0(@Nullable String $this$isJava_u2dKcqRzx0) {
/* 355 */     String str1 = ($this$isJava_u2dKcqRzx0 != null) ? MimeType.base-9EQw4cI($this$isJava_u2dKcqRzx0) : null, str2 = MimeType.Known.INSTANCE.getJAVA-9EQw4cI(); return (str1 == null) ? false : MimeType.equals-impl0(str1, str2);
/*     */   }
/*     */   public static final boolean isXml-KcqRzx0(@Nullable String $this$isXml_u2dKcqRzx0) {
/* 358 */     String str1 = ($this$isXml_u2dKcqRzx0 != null) ? MimeType.base-9EQw4cI($this$isXml_u2dKcqRzx0) : null, str2 = MimeType.Known.INSTANCE.getXML-9EQw4cI(); return (str1 == null) ? false : MimeType.equals-impl0(str1, str2);
/*     */   }
/*     */   public static final boolean isGradle-KcqRzx0(@Nullable String $this$isGradle_u2dKcqRzx0) {
/* 361 */     return Intrinsics.areEqual(($this$isGradle_u2dKcqRzx0 != null) ? MimeType.getRole-impl$foundation($this$isGradle_u2dKcqRzx0) : null, "gradle");
/*     */   }
/*     */   public static final boolean isVersionCatalog-KcqRzx0(@Nullable String $this$isVersionCatalog_u2dKcqRzx0) {
/* 364 */     return Intrinsics.areEqual(($this$isVersionCatalog_u2dKcqRzx0 != null) ? MimeType.getRole-impl$foundation($this$isVersionCatalog_u2dKcqRzx0) : null, "version-catalog");
/*     */   }
/*     */   public static final boolean isManifest-KcqRzx0(@Nullable String $this$isManifest_u2dKcqRzx0) {
/* 367 */     return Intrinsics.areEqual(($this$isManifest_u2dKcqRzx0 != null) ? MimeType.getRole-impl$foundation($this$isManifest_u2dKcqRzx0) : null, "manifest");
/*     */   }
/*     */   public static final boolean isSql-KcqRzx0(@Nullable String $this$isSql_u2dKcqRzx0) {
/* 370 */     String str1 = ($this$isSql_u2dKcqRzx0 != null) ? MimeType.base-9EQw4cI($this$isSql_u2dKcqRzx0) : null, str2 = MimeType.Known.INSTANCE.getSQL-9EQw4cI(); return (str1 == null) ? false : MimeType.equals-impl0(str1, str2);
/*     */   }
/*     */   public static final boolean isRegex-KcqRzx0(@Nullable String $this$isRegex_u2dKcqRzx0) {
/* 373 */     String str1 = ($this$isRegex_u2dKcqRzx0 != null) ? MimeType.base-9EQw4cI($this$isRegex_u2dKcqRzx0) : null, str2 = MimeType.Known.INSTANCE.getREGEX-9EQw4cI(); return (str1 == null) ? false : MimeType.equals-impl0(str1, str2);
/*     */   }
/*     */   public static final boolean isProto-KcqRzx0(@Nullable String $this$isProto_u2dKcqRzx0) {
/* 376 */     String str1 = ($this$isProto_u2dKcqRzx0 != null) ? MimeType.base-9EQw4cI($this$isProto_u2dKcqRzx0) : null, str2 = MimeType.Known.INSTANCE.getPROTO-9EQw4cI(); return (str1 == null) ? false : MimeType.equals-impl0(str1, str2);
/*     */   }
/*     */   private static final String capitalizeAsciiOnly(String $this$capitalizeAsciiOnly) {
/* 379 */     if ((((CharSequence)$this$capitalizeAsciiOnly).length() == 0)) return $this$capitalizeAsciiOnly; 
/* 380 */     char c = $this$capitalizeAsciiOnly.charAt(0);
/*     */     
/* 382 */     int i = $this$capitalizeAsciiOnly.length(); StringBuilder stringBuilder1 = new StringBuilder(i), $this$capitalizeAsciiOnly_u24lambda_u240 = stringBuilder1; int $i$a$-buildString-MimeTypeKt$capitalizeAsciiOnly$1 = 0;
/* 383 */     $this$capitalizeAsciiOnly_u24lambda_u240.append(Character.toUpperCase(c));
/* 384 */     $this$capitalizeAsciiOnly_u24lambda_u240.append($this$capitalizeAsciiOnly, 1, $this$capitalizeAsciiOnly.length());
/*     */     
/*     */     Intrinsics.checkNotNullExpressionValue(stringBuilder1.toString(), "toString(...)");
/* 387 */     return (('a' <= c) ? ((c < '{')) : false) ? stringBuilder1.toString() : $this$capitalizeAsciiOnly;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundation\code\MimeTypeKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */