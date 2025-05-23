/*    */ package org.jetbrains.compose.resources;
/*    */ 
/*    */ import androidx.compose.runtime.Immutable;
/*    */ import java.util.Set;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000>\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\000\n\002\020\"\n\002\030\002\n\002\b\006\n\002\020\013\n\002\b\002\n\002\020\b\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\b7\030\0002\0020\001B\035\b\005\022\006\020\002\032\0020\003\022\f\020\004\032\b\022\004\022\0020\0060\005¢\006\002\020\007J\023\020\f\032\0020\r2\b\020\016\032\004\030\0010\001H\002J\b\020\017\032\0020\020H\026R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\b\020\tR\032\020\004\032\b\022\004\022\0020\0060\005X\004¢\006\b\n\000\032\004\b\n\020\013\001\005\021\022\023\024\025¨\006\026"}, d2 = {"Lorg/jetbrains/compose/resources/Resource;", "", "id", "", "items", "", "Lorg/jetbrains/compose/resources/ResourceItem;", "(Ljava/lang/String;Ljava/util/Set;)V", "getId$library", "()Ljava/lang/String;", "getItems$library", "()Ljava/util/Set;", "equals", "", "other", "hashCode", "", "Lorg/jetbrains/compose/resources/DrawableResource;", "Lorg/jetbrains/compose/resources/FontResource;", "Lorg/jetbrains/compose/resources/PluralStringResource;", "Lorg/jetbrains/compose/resources/StringArrayResource;", "Lorg/jetbrains/compose/resources/StringResource;", "library"})
/*    */ @Immutable
/*    */ public abstract class Resource {
/*    */   @NotNull
/*    */   private final String id;
/*    */   @NotNull
/*    */   private final Set<ResourceItem> items;
/*    */   public static final int $stable;
/*    */   
/*    */   @InternalResourceApi
/* 20 */   private Resource(String id, Set<ResourceItem> items) { this.id = id;
/* 21 */     this.items = items; } @NotNull public final Set<ResourceItem> getItems$library() { return this.items; }
/*    */   @NotNull
/*    */   public final String getId$library() { return this.id; } public boolean equals(@Nullable Object other) {
/* 24 */     if (this == other) return true; 
/* 25 */     if (other == null || getClass() != other.getClass()) return false;
/*    */     
/* 27 */     (Resource)other;
/*    */     
/* 29 */     return Intrinsics.areEqual(this.id, ((Resource)other).id);
/*    */   }
/*    */   
/*    */   public int hashCode() {
/* 33 */     return this.id.hashCode();
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\library-desktop-1.7.3.jar!\org\jetbrains\compose\resources\Resource.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */