/*    */ package com.intellij.ml.llm.matterhorn.utils;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000\030\n\000\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\020\022\n\000\032\n\020\005\032\0020\006*\0020\007\032\n\020\005\032\0020\006*\0020\006\"4\020\000\032&\022\f\022\n \003*\004\030\0010\0020\002 \003*\022\022\f\022\n \003*\004\030\0010\0020\002\030\0010\0010\001X\004¢\006\004\n\002\020\004¨\006\b"}, d2 = {"SHA_256", "Ljava/lang/ThreadLocal;", "Ljava/security/MessageDigest;", "kotlin.jvm.PlatformType", "Ljava/lang/ThreadLocal;", "hash256", "", "", "core"})
/*    */ public final class HashUtilsKt {
/*  6 */   private static final ThreadLocal<MessageDigest> SHA_256 = ThreadLocal.withInitial(HashUtilsKt::SHA_256$lambda$0); private static final MessageDigest SHA_256$lambda$0() {
/*  7 */     return MessageDigest.getInstance("SHA-256");
/*    */   }
/*    */   @NotNull
/* 10 */   public static final String hash256(@NotNull byte[] $this$hash256) { Intrinsics.checkNotNullParameter($this$hash256, "<this>"); Intrinsics.checkNotNullExpressionValue(((MessageDigest)SHA_256.get()).digest($this$hash256), "digest(...)"); return ArraysKt.joinToString$default(((MessageDigest)SHA_256.get()).digest($this$hash256), "", null, null, 0, null, HashUtilsKt::hash256$lambda$1, 30, null); } private static final CharSequence hash256$lambda$1(byte it) { String str = "%02x"; Object[] arrayOfObject = new Object[1]; arrayOfObject[0] = Byte.valueOf(it); arrayOfObject = arrayOfObject; Intrinsics.checkNotNullExpressionValue(String.format(str, Arrays.copyOf(arrayOfObject, arrayOfObject.length)), "format(...)"); return String.format(str, Arrays.copyOf(arrayOfObject, arrayOfObject.length)); } @NotNull
/* 11 */   public static final String hash256(@NotNull String $this$hash256) { Intrinsics.checkNotNullParameter($this$hash256, "<this>"); String str = $this$hash256; Intrinsics.checkNotNullExpressionValue(str.getBytes(Charsets.UTF_8), "getBytes(...)"); return hash256(str.getBytes(Charsets.UTF_8)); }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhor\\utils\HashUtilsKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */