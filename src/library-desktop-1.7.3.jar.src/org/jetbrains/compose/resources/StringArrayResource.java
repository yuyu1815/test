/*    */ package org.jetbrains.compose.resources;
/*    */ 
/*    */ import androidx.compose.runtime.Immutable;
/*    */ import java.util.Set;
/*    */ import kotlin.Metadata;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\020\"\n\002\030\002\n\002\b\004\b\007\030\0002\0020\001B%\b\007\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\f\020\005\032\b\022\004\022\0020\0070\006¢\006\002\020\bR\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\t\020\n¨\006\013"}, d2 = {"Lorg/jetbrains/compose/resources/StringArrayResource;", "Lorg/jetbrains/compose/resources/Resource;", "id", "", "key", "items", "", "Lorg/jetbrains/compose/resources/ResourceItem;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)V", "getKey", "()Ljava/lang/String;", "library"})
/*    */ @Immutable
/*    */ public final class StringArrayResource
/*    */   extends Resource
/*    */ {
/*    */   @NotNull
/*    */   private final String key;
/*    */   public static final int $stable;
/*    */   
/*    */   @InternalResourceApi
/*    */   public StringArrayResource(@NotNull String id, @NotNull String key, @NotNull Set items) {
/* 21 */     super(id, items, null); this.key = key; } @NotNull public final String getKey() { return this.key; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\library-desktop-1.7.3.jar!\org\jetbrains\compose\resources\StringArrayResource.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */