/*    */ package ai.grazie.utils;
/*    */ import java.util.Collection;
/*    */ import java.util.Iterator;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlin.ranges.CharRange;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020 \n\002\020\f\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\b\n\000\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\016\020\b\032\0020\t2\006\020\n\032\0020\013R\024\020\003\032\b\022\004\022\0020\0050\004X\004¢\006\002\n\000R\016\020\006\032\0020\007X\004¢\006\002\n\000¨\006\f"}, d2 = {"Lai/grazie/utils/SecureRandom;", "", "()V", "allowedChars", "", "", "secure", "Ljava/security/SecureRandom;", "string", "", "length", "", "utils-common"})
/*    */ @SourceDebugExtension({"SMAP\nRandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Random.kt\nai/grazie/utils/SecureRandom\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,25:1\n1557#2:26\n1628#2,3:27\n*S KotlinDebug\n*F\n+ 1 Random.kt\nai/grazie/utils/SecureRandom\n*L\n21#1:26\n21#1:27,3\n*E\n"})
/*    */ public final class SecureRandom {
/*    */   @NotNull
/* 13 */   public static final SecureRandom INSTANCE = new SecureRandom(); @NotNull private static final List<Character> allowedChars = CollectionsKt.plus(CollectionsKt.plus((Iterable)new CharRange('A', 'Z'), (Iterable)new CharRange('a', 'z')), (Iterable)new CharRange('0', '9')); @NotNull
/* 14 */   private static final java.security.SecureRandom secure = new java.security.SecureRandom();
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final String string(int length) {
/* 20 */     Iterable iterable1 = (Iterable)new IntRange(1, length);
/* 21 */     int $i$f$map = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 26 */     Iterable iterable2 = iterable1; Collection<Character> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable1, 10)); int $i$f$mapTo = 0;
/* 27 */     for (Iterator iterator = iterable2.iterator(); iterator.hasNext(); ) { int item$iv$iv = ((IntIterator)iterator).nextInt();
/* 28 */       int i = item$iv$iv; Collection<Character> collection = destination$iv$iv; int $i$a$-map-SecureRandom$string$1 = 0; collection.add(Character.valueOf(((Character)allowedChars.get(secure.nextInt(allowedChars.size()))).charValue())); }
/* 29 */      return CollectionsKt.joinToString$default(destination$iv$iv, "", null, null, 0, null, null, 62, null);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\SecureRandom.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */