/*******************************************************************************
 * Copyright 2010 Mario Zechner (contact@badlogicgames.com)
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS"
 * BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 ******************************************************************************/

package com.badlogic.gdx.physics.box2d.joints;

import org.loon.framework.android.game.core.geom.Vector2f;

import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.JointDef;

/**
 * Friction joint definition.
 */
public class FrictionJointDef extends JointDef {

	public FrictionJointDef () {
		type = JointType.FrictionJoint;
	}

	/**
	 * Initialize the bodies, anchors, axis, and reference angle using the world anchor and world axis.
	 */
	public void initialize (Body bodyA, Body bodyB, Vector2f anchor) {
		this.bodyA = bodyA;
		this.bodyB = bodyB;
		localAnchorA.set(bodyA.getLocalPoint(anchor));
		localAnchorB.set(bodyB.getLocalPoint(anchor));
	}

	/**
	 * The local anchor point relative to bodyA's origin.
	 */
	public final Vector2f localAnchorA = new Vector2f();

	/**
	 * The local anchor point relative to bodyB's origin.
	 */
	public final Vector2f localAnchorB = new Vector2f();

	/**
	 * The maximum friction force in N.
	 */
	public float maxForce = 0;

	/**
	 * The maximum friction torque in N-m.
	 */
	public float maxTorque = 0;
}