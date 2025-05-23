/*    */ package kotlinx.serialization.json.internal;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Result;
/*    */ import kotlin.ResultKt;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000\b\n\000\n\002\020\b\n\000\"\016\020\000\032\0020\001X\004¢\006\002\n\000¨\006\002"}, d2 = {"MAX_CHARS_IN_POOL", "", "kotlinx-serialization-json"})
/*    */ public final class ArrayPoolsKt {
/*    */   static {
/*    */     
/* 10 */     try { int $i$a$-runCatching-ArrayPoolsKt$MAX_CHARS_IN_POOL$1 = 0;
/* 11 */       System.getProperty("kotlinx.serialization.json.pool.size"); object = Result.constructor-impl((System.getProperty("kotlinx.serialization.json.pool.size") != null) ? StringsKt.toIntOrNull(System.getProperty("kotlinx.serialization.json.pool.size")) : null); } catch (Throwable throwable) { object = Result.constructor-impl(ResultKt.createFailure(throwable)); }
/* 12 */      Object object = object; (Integer)(Result.isFailure-impl(object) ? null : (Integer)object); MAX_CHARS_IN_POOL = ((Integer)(Result.isFailure-impl(object) ? null : (Integer)object) != null) ? ((Integer)(Result.isFailure-impl(object) ? null : (Integer)object)).intValue() : 2097152;
/*    */   }
/*    */   
/*    */   private static final int MAX_CHARS_IN_POOL;
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-json-jvm-1.8.0.jar!\kotlinx\serialization\json\internal\ArrayPoolsKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */