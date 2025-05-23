/*    */ package kotlinx.serialization.json.internal;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.enums.EnumEntries;
/*    */ import kotlin.enums.EnumEntriesKt;
/*    */ import kotlin.jvm.JvmField;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\020\n\000\n\002\020\f\n\002\b\b\b\002\030\0002\b\022\004\022\0020\0000\001B\031\b\002\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003¢\006\004\b\005\020\006R\020\020\002\032\0020\0038\006X\004¢\006\002\n\000R\020\020\004\032\0020\0038\006X\004¢\006\002\n\000j\002\b\007j\002\b\bj\002\b\tj\002\b\n¨\006\013"}, d2 = {"Lkotlinx/serialization/json/internal/WriteMode;", "", "begin", "", "end", "<init>", "(Ljava/lang/String;ICC)V", "OBJ", "LIST", "MAP", "POLY_OBJ", "kotlinx-serialization-json"})
/*    */ public enum WriteMode
/*    */ {
/* 15 */   OBJ('{', '}'),
/* 16 */   LIST('[', ']'),
/* 17 */   MAP('{', '}'),
/* 18 */   POLY_OBJ('[', ']'); @NotNull
/* 19 */   public static EnumEntries<WriteMode> getEntries() { return $ENTRIES; }
/*    */ 
/*    */   
/*    */   @JvmField
/*    */   public final char begin;
/*    */   @JvmField
/*    */   public final char end;
/*    */   
/*    */   WriteMode(char begin, char end) {
/*    */     this.begin = begin;
/*    */     this.end = end;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-json-jvm-1.8.0.jar!\kotlinx\serialization\json\internal\WriteMode.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */