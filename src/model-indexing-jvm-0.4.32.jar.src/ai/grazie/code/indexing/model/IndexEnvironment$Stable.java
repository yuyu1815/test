/*    */ package ai.grazie.code.indexing.model;
/*    */ 
/*    */ import java.lang.annotation.Annotation;
/*    */ import kotlin.Lazy;
/*    */ import kotlin.LazyKt;
/*    */ import kotlin.LazyThreadSafetyMode;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.Serializable;
/*    */ import kotlinx.serialization.internal.ObjectSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\003\n\002\030\002\n\000\bÇ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\007\032\b\022\004\022\0020\0000\bHÆ\001R\024\020\003\032\0020\004XD¢\006\b\n\000\032\004\b\005\020\006¨\006\t"}, d2 = {"Lai/grazie/code/indexing/model/IndexEnvironment$Stable;", "Lai/grazie/code/indexing/model/IndexEnvironment;", "()V", "id", "", "getId", "()Ljava/lang/String;", "serializer", "Lkotlinx/serialization/KSerializer;", "model-indexing"})
/*    */ public final class Stable
/*    */   extends IndexEnvironment
/*    */ {
/*    */   @NotNull
/*    */   public final KSerializer<Stable> serializer() {
/* 22 */     return get$cachedSerializer();
/* 23 */   } private Stable() { super(null); } @NotNull
/* 24 */   private static final String id = "Stbl"; @NotNull public static final Stable INSTANCE = new Stable(); @NotNull public String getId() { return id; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-indexing-jvm-0.4.32.jar!\ai\grazie\code\indexing\model\IndexEnvironment$Stable.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */